package com.xworkz.ipl.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ball {
    @Autowired
    private double ballCost;
    Ball(){
        System.out.println("running Ball");
    }
}