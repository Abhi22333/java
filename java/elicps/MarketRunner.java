package com.xworkz.market;


public class MarketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarketStore store=new MarketStore();
		// store.display();
		
		MarketData data1=new MarketData("mutton shop","bengaluru");
		MarketData data2=new MarketData("flower shop","Rajajinagara");
		MarketData data3=new MarketData("sandal shop","vijayanagara");
		MarketData data4=new MarketData("vegetable market","ksr");
		MarketData data5=new MarketData("bangal shop","jayanagara");
		
		
		store.save(data1);
		store.save(data2);
		store.save(data3);
		store.save(data4);
		store.save(data5);
		
		
		store.display();

	}
	}

