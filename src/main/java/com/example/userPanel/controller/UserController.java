package com.example.userPanel.controller;

import com.example.userPanel.model.UserData;
import com.example.userPanel.repository.UserRepository;
import com.example.userPanel.service.Validator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserRepository userRepository;

    UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/registerForm")
    public String register() {
        return "registerForm";
    }

    @PostMapping("/register")
    public String userRegistration(@ModelAttribute("userData") UserData userData) throws Exception {
        Validator validator = new Validator();
        System.out.println(userData.toString());
        validator.validateUser(userData);
        userRepository.save(userData);
        return "welcome";
    }

}
