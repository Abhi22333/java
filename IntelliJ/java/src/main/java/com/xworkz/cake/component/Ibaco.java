package com.xworkz.cake.component;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@PropertySource("classpath:coldcake.properties")
public class Ibaco {

    @Value("${dbusername}")
    private String user;

    @Value("${password}")
    private String password;

    @PostConstruct
    public void print()
    {
        System.out.println(this.user);
        System.out.println(this.password);
    }
}