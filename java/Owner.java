class Owner{
	
	String name;
	int age;
	char gender;
	
	public Owner(String name,int age, char gender){
		
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void show(){
		
		System.out.println("owner name:"+name);
		System.out.println("owner age:"+age);
		System.out.println("owner gender:"+gender);
	}
	
}