package com.foam.photo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Picture {
    private Integer id;
    private String name;
    private String location;
    private String description;
    private Date date;
}
