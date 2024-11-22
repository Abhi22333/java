package com.xworkz.customerdetails.repo;

import com.xworkz.customerdetalis.dto.UserDTO;

public interface UserRepository {

	boolean save(UserDTO userDTO);
}
