package com.foam.photo.pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String nickName;
    private Integer gender;
    private Date createDate;
    private Date lastLoginDate;
    private Integer level;
}
