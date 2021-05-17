package com.foam.photo.service;

import java.util.List;

import com.foam.photo.pojo.User;

/**
 * 功能描述
 *
 * @author gWX792602
 * @since 2021-05-17
 */
public interface UserService {
    List<User> queryAllUser() ;

    User queryUserById(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
