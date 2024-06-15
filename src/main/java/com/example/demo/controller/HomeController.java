package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.services.PaysService;

@Controller
public class HomeController {
    @Autowired
    PaysService paysServices;
        
    @GetMapping("/")
    public String login(Model model) {
        model.addAttribute("pays", paysServices.findAll());
        return "index";
    }
}
