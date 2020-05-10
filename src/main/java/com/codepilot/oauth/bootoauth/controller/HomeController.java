package com.codepilot.oauth.bootoauth.controller;

import com.codepilot.oauth.bootoauth.util.AuthenticationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    AuthenticationUtil authenticationUtil;

    @RequestMapping("/")
    public String getUserName(Model model){
        model.addAttribute("displayName", authenticationUtil.getAuthToken().getDisplayName());
        return "home";
    }

}
