package com.jidendiran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class Start_Application {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "We have successfully built a sprint boot application using Jenkins Pipeline");
        model.addAttribute("msg", "I am Jidendiran, Congratulation on your Application Progress");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(Start_Application.class, args);
    }

}
