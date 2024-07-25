class AutoDriverRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in AutoDriverRunner");
	  
	  AutoDriver autoDriver=new AutoDriver();
	  int age=autoDriver.age;
	  String gender=autoDriver.gender;
	  long mobileno=autoDriver.mobileno;
	  System.out.println("autoDriver age:"+age);
	  System.out.println("autoDriver gender:"+gender);
	  System.out.println("autoDriver mobileno:"+mobileno);
	  
	  
	   System.out.print("end main in AutoDriverRunner");
  }
 }