package com.xworkz.forms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ScholarshipDTO {

    private String firstName;
    private String lastName;
    private String email;
    private  Long phoneNo;
    private int otp;
    private  String password;
}
