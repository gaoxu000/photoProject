package com.foam.photo.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model, HttpSession httpSession){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);

        try {
            subject.login(usernamePasswordToken);
            return "redirect:/index";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg","用户名不存在!");
            e.printStackTrace();
            return "/login";
        }catch (IncorrectCredentialsException e) {
            model.addAttribute("msg","密码错误!");
            e.printStackTrace();
            return "/login";
        }
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "/login";
    }

}
