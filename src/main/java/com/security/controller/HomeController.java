package com.security.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/admin")
    public String admin(){

        return "This is admin page";
    }


    @GetMapping("/index")
    public String index(){
        return "This is index page";
    }

    @GetMapping("/dashboard")
    public ResponseEntity<String> dashboard(){
        return ResponseEntity.ok("This is dashboard page");
    }


}
