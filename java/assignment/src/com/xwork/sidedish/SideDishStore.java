package com.xwork.sidedish;


public class SideDishStore {

	
	private SideDishData[] datas=new SideDishData[5];
	private int index=0;
	
	public void save(SideDishData data) {
		System.out.print("save SideDishData");
		this.datas[this.index]=data;
		this.index++;
		
		}
 public void display() {
	 System.out.println("display SideDishData");
	 for(SideDishData data:this.datas)
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
