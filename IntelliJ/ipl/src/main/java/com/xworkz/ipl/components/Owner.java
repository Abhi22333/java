
package com.xworkz.ipl.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {
    @Autowired
    private String ownerName;
    Owner(){
        System.out.println("running Owner");
    }
}
