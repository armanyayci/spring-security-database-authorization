package com.security.security.util;

import com.security.security.model.Role;
import com.security.security.model.User;
import com.security.security.repository.RoleRepository;
import com.security.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoad implements ApplicationRunner
{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Role roleAdmin = Role.builder().id(1).role_name("ROLE_ADMIN").build();
        Role roleUser = Role.builder().id(2).role_name("ROLE_USER").build();

        roleRepository.save(roleAdmin);
        roleRepository.save(roleUser);


        List<Role> adminRoleList = new ArrayList<>();
        adminRoleList.add(roleAdmin);

        User admin = User.builder().id(3).name("admin").password("1234").roles(adminRoleList).build();
        userRepository.save(admin);

        List<Role> userRoleList = new ArrayList<>();

        userRoleList.add(roleUser);

        User user = User.builder().id(4).name("user").password("1234").roles(userRoleList).build();
        userRepository.save(user);


    }
}
