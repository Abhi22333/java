package com.xworkz.task.service;

import com.xworkz.task.dto.SignupDTO;

public interface SignUpService {
	boolean validateAndSave(SignupDTO dto);

}
