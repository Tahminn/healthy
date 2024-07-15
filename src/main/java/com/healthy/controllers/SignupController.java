package com.healthy.controllers;


import com.healthy.repository.UserRepository;
import com.healthy.model.User;
import com.healthy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {


    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;




    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }


    @PostMapping("/signup")
    public String handleTraineeSignupForm(@ModelAttribute User user) {
        user.setRole("ROLE_TRAINEE");
        userService.save(user);

        return "redirect:/login";
    }


    @PostMapping("/register")
    public String handleTrainerSignupForm(@ModelAttribute("user") User user) {
        user.setRole("ROLE_TRAINER");
        userService.save(user);
        return "redirect:/login";
    }


    @GetMapping("/trainer")
    public String showTrainerSignupForm(Model model) {
        model.addAttribute("user", new User());
        return "trainer";
    }


}


