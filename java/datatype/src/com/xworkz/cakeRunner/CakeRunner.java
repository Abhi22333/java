package com.xworkz.cakeRunner;

import com.xworkz.cake.Cake;
import com.xworkz.cake.Sonu;
import com.xworkz.cake.Sudeep;
import com.xworkz.cake.Vihaan;

public class CakeRunner {

	public static void main(String[] args) {
		
		Sudeep sudeep=new Sudeep();
		sudeep.cake(null);
		
		Cake cake = new Cake("Chocolate Charm", "Rich Dark Chocolate", "Devil food cake");
		
		Vihaan vihaan=new Vihaan(cake);
		vihaan.rinse();
		
		Sonu sonu=new Sonu();
		Cake ref=sonu.cheese();
		if(ref !=null)		{
			ref.choco();
			ref.fill();
		}
		
	}
		
}