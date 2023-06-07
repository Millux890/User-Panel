package com.example.userPanel.controller;

import com.example.userPanel.model.User;
import com.example.userPanel.repository.UserRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private final UserRepository userRepository;

    IndexController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/registerForm")
    public String register() {

        return "registerForm";
    }

    @PostMapping("/register")
    public String userRegistration(@ModelAttribute("user") User user, Model model) {
        System.out.println(user.toString());
        validateUser(user);
        model.addAttribute("firstname", user.getFirstName());
        model.addAttribute("lastname", user.getLastName());

        userRepository.save(user);

        return "welcome";
    }

    private void validateUser(User user) {
        if (user.getEmail().isEmpty()) {
            System.out.println("Please insert email");
        }
    }

}
