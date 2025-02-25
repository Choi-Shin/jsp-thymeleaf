package com.example.jsp_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/jsp")
    public String home() {
        return "index";
    }

    @GetMapping("/thymeleaf")
    public String home_th() {
        return "thymeleaf/index";
    }
}
