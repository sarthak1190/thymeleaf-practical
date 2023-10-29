package com.thymeleafpractical.thymeleafpractical.Controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    
    @GetMapping("/about")
    public String about(Model model){
        System.out.println("inside about handler...");

        model.addAttribute("name","Sarthak");
        model.addAttribute("currentDate", new java.util.Date().toString());

        return "about"; //about.html
    }

    //handling iteration
    @GetMapping("/iterate")
    public String iterate(Model m){
        //send
        //create a list, set of collection
        List<String> names=List.of("Sarthak", "Mehta", "Sid");
        m.addAttribute("names", names);
        return "iterate";
    }


    //handler for conditional statements
    @GetMapping("/condition")
    public String condition(Model m){
        System.out.println("conditional handler executed.!");

        m.addAttribute("isActive", true);
        m.addAttribute("gender", "M");

        List<Integer> list=List.of();
        m.addAttribute("myList", list);

        return "condition";
    }

    //handler for including fragments
    @GetMapping("/fragments")
    public String fragments(Model m){
        m.addAttribute("title", "I like to eat fried rice");
        m.addAttribute("subtitle", LocalDateTime.now().toString());
        //processing logic
        return "fragments";
    }

    //for new about
    @GetMapping("/aboutnew")
    public String aboutNew(){
        return "aboutnew";
    }

    //for contact
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
}
