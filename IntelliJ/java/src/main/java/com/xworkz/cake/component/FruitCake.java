package com.xworkz.cake.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FruitCake {

    @Autowired
    @Qualifier("cost")
    private double FruitCake ;
    public FruitCake ()
    {
        System.out.println("running FruitCake ");
    }
}