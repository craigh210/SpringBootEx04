package com.cwhcode.springbootex04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    //Use the default page
    @RequestMapping("/")
    public String loginPage() {
        return "logintemplate";
    }
    @RequestMapping("/processlogin")
    public String responsePage(@RequestParam("login") String login, Model model) {
        model.addAttribute("loginval", login);
        return "respond";
    }
}
