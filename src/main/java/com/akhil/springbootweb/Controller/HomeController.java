package com.akhil.springbootweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class HomeController {

    @GetMapping("home")
    public String home(Model model) {
        model.addAttribute("name", "Tom");
        return "home";
    }
}
