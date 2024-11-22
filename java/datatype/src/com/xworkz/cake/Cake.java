package com.xworkz.cake;

public class Cake {
	private  String name;
	private  String favlour;
	private  String type;
	
	
	public Cake() {
		super();
		System.out.println("created cake using String,String,String const...");
	}
	
	  public Cake(String name, String favlour, String type) {
		super();
		this.name = name;
		this.favlour = favlour;
		this.type = type;
	}

    public void choco()
    {
		System.out.println("running Cake");
    }
    public void fill()
    {
    	System.out.println("name:"+name);
    	System.out.println("favlour:"+favlour);
    	System.out.println("type:"+type);
    }
}
    	

