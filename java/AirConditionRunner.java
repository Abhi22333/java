class AirConditionRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in AirConditionRunner");
	  
	  AirCondition airCondition=new AirCondition();
	  double price=airCondition.price;
	  String shape=airCondition.shape;
	  String brand=airCondition.brand;
	  System.out.println("AirCondition  price:"+ price);
	  System.out.println("AirCondition shape:"+shape);
	  System.out.println("AirCondition brand:"+brand);
	  
	  
	   System.out.print("end main in AirConditionRunner");
  }
 }