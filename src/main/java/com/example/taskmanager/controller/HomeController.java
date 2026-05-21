package com.example.taskmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Student Task Manager! Autentificarea funcționează perfect. Accesează /tasks pentru lista ta.";
    }
}