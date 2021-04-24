package com.foam.photo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfigure implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/about.html").setViewName("about");
        registry.addViewController("/about").setViewName("about");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/project.html").setViewName("project");
        registry.addViewController("/project").setViewName("project");
        registry.addViewController("/components.html").setViewName("components");
        registry.addViewController("/components").setViewName("components");
        registry.addViewController("/contact.html").setViewName("contact");
        registry.addViewController("/contact").setViewName("contact");
        registry.addViewController("/services.html").setViewName("services");
        registry.addViewController("/services").setViewName("services");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/login.html", "/user/login", "/", "/login");
    }
}
