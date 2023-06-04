package com.example.UserPanel.Controller;

import com.example.UserPanel.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    @GetMapping("/registerForm")
    public String register() {

        return "registerForm";
    }

    @PostMapping("/register")
    public String userRegistration(@ModelAttribute User user, Model model) {
        System.out.println(user.toString());

        model.addAttribute("firstname", user.getFirstName());
        model.addAttribute("lastname", user.getLastName());

        return "welcome";
    }


}
