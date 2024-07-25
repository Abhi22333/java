class FoodRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in FoodRunner ");
	  
	  Food food=new Food();
	  double cost=food.cost;
	  String name=food.name;
	  String colour=food.colour;
	  int quantity=food.quantity;
	  System.out.println("Food cost:"+ cost);
	  System.out.println("Food name:"+name);
	  System.out.println("Food colour:"+colour);
	  System.out.println("Food quantity:"+quantity);
	  
	  food.cost=100;
	  food.name="kabab";
	  food.colour="red";
	  food.quantity=200;
	  System.out.println("Food cost updated:"+food.cost);
	  System.out.println("Food name updated:"+food.name);
	  System.out.println("Food colour updated:"+food.colour);
	  System.out.println("Food quantity updated:"+food.quantity);
	  
	   System.out.print("end main in FoodRunner");
  }
 }