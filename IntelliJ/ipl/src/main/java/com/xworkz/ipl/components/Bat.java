package com.xworkz.ipl.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bat {
    @Autowired
    private double batCost;
    Bat(){
        System.out.println("running bat");
    }
}