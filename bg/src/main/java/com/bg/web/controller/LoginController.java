package com.bg.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(value = "/sign")
    public String getBoardList(Model model) throws Exception {
        return "contents/login/login";
    }
}
