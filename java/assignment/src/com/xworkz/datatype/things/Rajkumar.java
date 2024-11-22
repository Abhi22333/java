package com.xworkz.datatype.things;

public class Rajkumar {

	public Hat hat;
	
	public void fold()
	{
	if(hat!=null) {
	   hat.shade();
	   System.out.println(hat.colour);
	}else {
		System.out.println("hat is null");
	}
	}
}
