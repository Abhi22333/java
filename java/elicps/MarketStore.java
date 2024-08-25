package com.xworkz.market;



public class MarketStore {
	
	private MarketData[] datas=new MarketData[5];
	private int index=0;
	
	public void save(MarketData data) {
		System.out.print("save MarketData");
		this.datas[this.index]=data;
		this.index++;
		
		}
 public void display() {
	 System.out.println("display MarketData");
	 for(MarketData data:this.datas)
	 {
		 if(data !=null) {
			 data.show();
		 }
		 else {
			System.out.println("data is null"); 
		 }
	 }
 }

}
