class SoftwareEngineer{
	
	
	String name;
	int experience;
	String designation;
	long salary;
	
	public SoftwareEngineer(String name,int experience,String designation,long salary){
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	
	
	public void details(){
		
		
		System.out.println("software engineer name:"+name);
		System.out.println("software engineer experience:"+experience);
		System.out.println("software engineer designation:"+designation);
		System.out.println("software engineer salary:"+salary);
	}
	
	
	
}