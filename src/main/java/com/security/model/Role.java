package com.security.security.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Role")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "roleGen")
    @SequenceGenerator(name = "roleGen",sequenceName = "role_Sequence")
    @Column(name = "role_id")
    private int id;
    @Column(name = "role_name")
    private String role_name;

    @ManyToMany(fetch = FetchType.EAGER,
            mappedBy = "roles")
    private List<User> users;

}
