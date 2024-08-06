class Hotel{
	
	String name="Udupi";
	Owner owner=new Owner("Harshitha",23,'f');
	
	public Hotel(){
		
	}
	
	public void display(){
		
		System.out.println("hotel name:"+name);
		owner.show();
	}
	
	
	
	
}