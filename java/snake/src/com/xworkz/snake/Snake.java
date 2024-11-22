package com.xworkz.snake;

public class Snake {
	
	private String type;
	private int length;
	private String name;
	
	
	
	public Snake(String type,int lenght,String name) {
		this.type=type;
		this.length=length;
		this.name=name;
	}
	
	public void akku() {
		System.out.println("type:"+this.type);
		System.out.println("length:"+this.length);
		System.out.println("name:"+this.name);
	}

}
//ctrl+shift+f=====it will allin-