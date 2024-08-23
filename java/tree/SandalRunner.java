package com.xworkz.tree;

public class SandalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SandalStore store=new SandalStore();
		// store.display();
		
		Sandal data1=new Sandal("Bata",7,1000,"black");
		Sandal data2=new Sandal("puma",6,3000,"white");
		Sandal data3=new Sandal("liberty",8,2000,"blue");
		Sandal data4=new Sandal("sparx",5,900,"brown");
		Sandal data5=new Sandal("nike",8,4000,"grey");
		store.save(data1);
		store.save(data2);
		store.save(data3);
		store.save(data4);
		store.save(data5);
		
		store.display();

	}

}
