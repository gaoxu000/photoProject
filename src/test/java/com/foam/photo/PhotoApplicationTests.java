package com.foam.photo;

import com.foam.photo.pojo.Picture;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PhotoApplicationTests {

    @Autowired
    private Picture picture;

    @Test
    void contextLoads() {
        System.out.println(picture);
    }

}
