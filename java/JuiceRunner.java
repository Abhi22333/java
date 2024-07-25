class JuiceRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in JuiceRunner ");
	  
	  Juice juice=new Juice();
	  double cost=juice.cost;
	  String name=juice.name;
	  String colour=juice.colour;
	  int quantity=juice.quantity;
	  System.out.println("Juice cost:"+ cost);
	  System.out.println("Juice name:"+name);
	  System.out.println("Juice colour:"+colour);
	  System.out.println("Juice quantity:"+quantity);
	  
	  juice.cost=100;
	  juice.name="Mango";
	  juice.colour="orange";
	  juice.quantity=2;
	  System.out.println("Juice cost updated:"+juice.cost);
	  System.out.println("Juice name updated:"+juice.name);
	  System.out.println("Juice colour updated:"+juice.colour);
	  System.out.println("Juice quantity updated:"+juice.quantity);
	  
	   System.out.print("end main in JuiceRunner");
  }
 }