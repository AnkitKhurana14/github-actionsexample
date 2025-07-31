package com.example.githubactions.cicdgithubactionsproject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}
