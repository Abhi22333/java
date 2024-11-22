package com.xworkz.sirpro;

public class Labour  {

	public void startMotor(starter starter) {
		if (starter!=null) {
			System.out.println("starter is not null");
			starter.on();
		}
		else {
			System.out.println("starter is null");
		}
	}
	
} 


