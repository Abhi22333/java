package com.xworkz.constantRunner;

import com.xworkz.constant.ProductType;
import com.xworkz.constantDTO.CustomerDTO;

public class ProductTypeRunner {
	public static void main(String[] args) {
		CustomerDTO customerDTO= new CustomerDTO("Abhishek","abhishektc47@gmail.com",ProductType.FOOTWARE);
		customerDTO.display();
	}
	

}
