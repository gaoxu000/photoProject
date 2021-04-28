package com.foam.photo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model, HttpSession httpSession){
        if (httpSession.getAttribute("loginUser")!=null){
            httpSession.removeAttribute("loginUser");
        }
        if (!StringUtils.isEmpty(username)&& "123".equals(password)){
            httpSession.setAttribute("loginUser",username);
            return "redirect:/index";
        }else {
            model.addAttribute("msg","用户密码错误!");
        }
        return "/login";
    }

}
