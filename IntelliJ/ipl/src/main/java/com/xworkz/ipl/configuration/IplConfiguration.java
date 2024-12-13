package com.xworkz.ipl.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.ipl")
public class IplConfiguration {
    IplConfiguration(){
        System.out.println("running IplConfiguration");
    }

    @Bean
    public String teamName(){
        return "DC";
    }

    public double budget(){
        return 100;
    }
    @Bean
    public String ownerName(){
        return "Abhishek";
    }
    @Bean
    public double batCost(){
        return 9000;
    }
    @Bean
    public double ballCost(){
        return 500;
    }
}