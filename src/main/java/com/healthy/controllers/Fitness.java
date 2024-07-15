package com.healthy.controllers;

import com.healthy.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Fitness {



    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("landing", new User());
        return "landing";
    }


    @GetMapping("/landing")
    public String landingPage(Model model) {
        model.addAttribute("landing", new User());
        return "landing";
    }

    @GetMapping("/diet")
    public String dietPage(Model model) {
        model.addAttribute("diet", new User());
        return "diet";
    }




}
