package com.xworkz.WashingMachineRunner;

import com.xworkz.washingmachine.Abhishek;
import com.xworkz.washingmachine.Bhumika;
import com.xworkz.washingmachine.Lakshmi;
import com.xworkz.washingmachine.Megha;
import com.xworkz.washingmachine.WashingMachine;
import com.xworkz.washingmachine.nayana;

public class WashingMachineRunner {

	public static void main(String[] args) {
		Megha megha=new Megha();
		megha.WashingMachine();
		
		Lakshmi lakshmi=new Lakshmi();
		lakshmi.machine(null);
		
		WashingMachine washingmachine1 = new WashingMachine("LG", "Topload", 9);
		Abhishek abhishek = new Abhishek(washingmachine1);
		abhishek.rinse();
		
		Bhumika bhumika = new Bhumika();
		WashingMachine ref = bhumika.spin();
		if (ref != null) {
			ref.rinse();
			ref.show();
			
			nayana nayana = new nayana();
			nayana.WashingMachine();
		}

	}
}


