package com.xworkz.cake.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.xworkz.cake")
public class CakeConfiguration {

    public CakeConfiguration()
    {
        System.out.println("running CakeConfiguration");
    }

    @Bean
    public double cost()
    {
        System.out.println("running cost method");
        return 180.0;
    }

    @Bean
    public double weight()
    {
        System.out.println("running weight method");
        return 1.5;
    }
}