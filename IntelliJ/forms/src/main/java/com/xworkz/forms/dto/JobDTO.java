package com.xworkz.forms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JobDTO {
    private String firstName;
    private String lastName;
    private String email;
    private  Long phoneNo;
    private int age;
    private  String collegeName;
    private String qualification;
    private  String percentage;
    private  String experience;
    private  String address;
}
