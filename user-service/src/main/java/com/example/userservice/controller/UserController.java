package com.example.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user-service")
public class UserController {

    @GetMapping("/health_check")
    public String healthCheck(HttpServletRequest request) {
        return String.format("It's Working in User Service on Port %s", request.getServerPort());
    }
}
