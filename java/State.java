class State{
	
	String name="Karnataka";
	String language;
	CapitalCity capitalCity=new CapitalCity("Bangalore",1098567);
	
	public State(String language){
		
		
		this.language=language;
	}
	
	public void show(){
		
		System.out.println("State name:"+name);
		System.out.println("State language:"+this.language);
		capitalCity.show();
	}
	
	
	
}