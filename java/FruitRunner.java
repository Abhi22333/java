class FruitRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in FruitRunner ");
	  
	  Fruit fruit=new Fruit();
	  float cost=fruit.cost;
	  String name=fruit.name;
	  String colour=fruit.colour;
	  float weight=fruit.weight;
	  System.out.println("Fruit cost:"+ cost);
	  System.out.println("Fruit name:"+name);
	  System.out.println("Fruit colour:"+colour);
	  System.out.println("Fruit weight:"+weight);
	  
	  fruit.cost=100;
	  fruit.name="strawberry";
	  fruit.colour="pink";
	  fruit.weight=2;
	  System.out.println("Fruit cost updated:"+fruit.cost);
	  System.out.println("Fruit name updated:"+fruit.name);
	  System.out.println("Fruit colour updated:"+fruit.colour);
	  System.out.println("Fruit weight updated:"+fruit.weight);
	  
	   System.out.print("end main in FruitRunner");
  }
 }