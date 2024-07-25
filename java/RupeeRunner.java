class RupeeRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in RupeeRunner");
	  
	  Rupee rupee=new Rupee();
	  int value=rupee.value;
	  String shape=rupee.shape;
	  float weight=rupee.weight;
	  System.out.println("Rupee value:"+value);
	  System.out.println("Rupee shape:"+shape);
	  System.out.println("Rupee weight:"+weight);
	  
	  
	   System.out.print("end main in RupeeRunner");
  }
 }