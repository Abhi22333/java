class Laptop{
	
	public static void store(){
		System.out.println("Stores the information");
		battery();
	}
	
	public static void display(){
		System.out.println("displays the information");
		storage();
	}
	
	public static void storage(){
		System.out.println("storage is full");
		battery();
	}
	
	public static void battery(){
		System.out.println("Battery is fully charged");
		store();
	}
	
}