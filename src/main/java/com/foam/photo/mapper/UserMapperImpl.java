package com.foam.photo.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.foam.photo.pojo.User;

/**
 * 功能描述
 *
 * @author gWX792602
 * @since 2021-05-17
 */
class UserMapperImpl implements UserMapper {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> queryAllUser() {
        return null;
    }

    @Override
    public User queryUserById(int id) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int id) {

    }
}
