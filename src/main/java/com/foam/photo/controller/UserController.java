package com.foam.photo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foam.photo.mapper.UserMapper;
import com.foam.photo.pojo.User;

/**
 * 功能描述
 *
 * @author gWX792602
 * @since 2021-04-26
 */
@RestController
class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/queryAllUser")
    public List<User> queryAllUser(){
        List<User> users = userMapper.queryAllUser();
        return users;
    }
    @GetMapping("/addUser")
    public String addUser(User user){
        userMapper.addUser(user);
        return "ok";
    }
    @GetMapping("/updateUser")
    public String updateUser(User user){
        userMapper.updateUser(user);
        return "ok";
    }
    @GetMapping("/deleteUser")
    public String deleteUser(User user){
        userMapper.deleteUser(5);
        return "ok";
    }

}
