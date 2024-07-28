class ClockRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in ClockRunner ");
	  
	  Clock clock=new Clock();
	  clock.cost=3000;
	  clock.quantity=4;
	  System.out.println("clock cost :"+clock.cost);
	  System.out.println("clock company :"+clock.company);
	  System.out.println("clock quantity :"+clock.quantity);
	  
	  
	   System.out.print("end main in ClockRunner");
  }
 }