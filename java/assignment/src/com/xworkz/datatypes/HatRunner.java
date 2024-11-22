package com.xworkz.datatypes;

import com.xworkz.datatype.things.Upendra;
import com.xworkz.datatype.things.*;

public class HatRunner 
{

	public static void main(String[] args)
	{
		Upendra upendra=new Upendra();
		upendra.wear();
		
		Yash yesh=new Yash();
		Hat hat=new Hat();
		yesh.tear(hat);
		
		Rajkumar rajkumar=new Rajkumar();
		Hat hat2=new Hat();
		rajkumar.hat= hat2;
		rajkumar.fold();
	}

}
