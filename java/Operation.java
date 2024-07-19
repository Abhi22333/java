class Operation{
	
	public static void main(String[] args){
		System.out.println("This is to invoke the metoh from another class");
		Laptop.storage();
		Laptop.battery();
		Laptop.display();
		//Laptop.charge();
		switchedoff();
		switchedon();
		colour();
		weight();
		fast();
		slow();
		reset();
		shutdown();
		display();
		dusty();
		
	}
	
	public static void switchedoff(){
		System.out.println("Laptop is switchedoff");
	}
	public static void switchedon(){
		System.out.println("Laptop is heated");
			
	}
	public static void colour(){
		System.out.println("Laptop is slow");
			
	}
	public static void weight(){
		System.out.println("Laptop is small in size");
			
	}
	public static void fast(){
		System.out.println("Laptop is in error");
			
	}
	public static void slow(){
		System.out.println("Laptop is big");
			
	}
	public static void reset(){
		System.out.println("Laptop is cooled");
			
	}
	public static void shutdown(){
		System.out.println("Laptop is dusty ");
			
	}
	public static void dusty(){
		System.out.println("Laptop is weight");
			
	}
	public static void display(){
		System.out.println("Laptop is slow");
	}
	
}