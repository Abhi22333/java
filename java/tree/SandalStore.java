package com.xworkz.tree;

public class SandalStore {

	private Sandal[] datas=new Sandal[5];
	private int index=0;
	
	public void save(Sandal data) {
		System.out.print("save sandal");
		this.datas[this.index]=data;
		this.index++;
		
		}
 public void display() {
	 System.out.println("display sandal");
	 for(Sandal data:this.datas)
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

