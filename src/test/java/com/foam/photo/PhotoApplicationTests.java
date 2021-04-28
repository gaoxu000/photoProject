package com.foam.photo;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.foam.photo.pojo.Picture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PhotoApplicationTests {

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() throws SQLException {

        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();

    }

}
