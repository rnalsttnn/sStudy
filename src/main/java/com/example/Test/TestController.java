package com.example.Test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TestController {
    @GetMapping("/king")
    public String home(Model model){
        Hamburger hbg = new Hamburger("불고기버거", 5800);
        Hamburger hbg2 = new Hamburger("통새우와퍼", 7500);

        model.addAttribute("hamburger", hbg);
        model.addAttribute("hamburger2", hbg2);
        model.addAttribute("hamburger3", hbg2);
        return "king";
    }



}
