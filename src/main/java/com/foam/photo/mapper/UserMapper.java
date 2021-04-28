package com.foam.photo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.foam.photo.pojo.User;

/**
 * 功能描述
 *
 * @author gWX792602
 * @since 2021-04-27
 */
@Component
@Mapper
public interface UserMapper {
    List<User> queryAllUser() ;

    User queryUserById(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

}
