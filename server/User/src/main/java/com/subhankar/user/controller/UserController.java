package com.subhankar.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

        @RequestMapping("/status")
        public String message() {
            return "User Service is up and running!";
        }
}
