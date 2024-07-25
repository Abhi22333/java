class ApplicationRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in ApplicationRunner ");
	  
	  Application application=new Application();
	  String name=application.name;
	  String logo=application.logo;
	  long apppassword=application.apppassword;
	  int star=application.star;
	  System.out.println("Application name:"+ name);
	  System.out.println("Application logo:"+logo);
	  System.out.println("Application apppassword:"+apppassword);
	  System.out.println("Application star:"+star);
	  
	  application.name="Pubg";
	  application.logo="Gun";
	  application.apppassword=1234556;
	  application.star=5;
	  System.out.println("Application name updated:"+application.name);
	  System.out.println("Application logo updated:"+application.logo);
	  System.out.println("Application apppassword updated:"+application.apppassword);
	  System.out.println("Application star updated:"+application.star);
	  
	   System.out.print("end main in ApplicationRunner");
  }
 }