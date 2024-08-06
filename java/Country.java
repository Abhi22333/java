class Country{
	
	String name;
	String continent;
	State state=new State("kannada");
	
	
	public Country(String name,String continent){
		
		
		this.name=name;
		this.continent=continent;
	}
	
	public void show()
	{
		
		System.out.println("country name:"+name);
		System.out.println("country continent:"+continent);
		state.show();
	}
	
	
	
}