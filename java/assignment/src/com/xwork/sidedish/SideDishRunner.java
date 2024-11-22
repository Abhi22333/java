package com.xwork.sidedish;


public class SideDishRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SideDishStore store=new SideDishStore();
		// store.display();
		
		SideDishData data1=new SideDishData("kabab",100,"nonveg");
		SideDishData data2=new SideDishData("papad",60,"sides");
		SideDishData data3=new SideDishData("greek salad",250,"salad");
		SideDishData data4=new SideDishData("chicken fry",350,"nonveg");
		SideDishData data5=new SideDishData("grilled chicken",400,"nonveg");
		
		
		store.save(data1);
		store.save(data2);
		store.save(data3);
		store.save(data4);
		store.save(data5);
		
		
		store.display();
	}
}
