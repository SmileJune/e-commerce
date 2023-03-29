package com.example.userservice.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user-service")
public class UserController {

    Environment env;

    UserController(Environment env) {
        this.env = env;
    }

    @GetMapping("/health_check")
    public String healthCheck() {
        return String.format("It's Working in User Service"
            + ", port(local.server.port)=" + env.getProperty("local.server.port")
            + ", port(server.port)=" + env.getProperty("server.port")
            + ", token secret=" + env.getProperty("token.secret")
            + ", token expiration time=" + env.getProperty("token.expiration_time"));
    }
}
