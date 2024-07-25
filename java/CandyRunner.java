class CandyRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in CandyRunner");
	  
	  Candy candy=new Candy();
	  float cost=candy.cost;
	  String flaver=candy.flaver;
	  String colour=candy.colour;
	  System.out.println("Candy cost:"+ cost);
	  System.out.println("Candy flaver:"+flaver);
	  System.out.println("Candy colour:"+colour);
	  
	  candy.cost=5;
	  candy.flaver="strawberry";
	  candy.colour="pink";
	  System.out.println("Candy cost updated:"+candy.cost);
	  System.out.println("Candy flaver updated:"+candy.flaver);
	  System.out.println("Candy colour updated:"+candy.colour);
	  
	   System.out.print("end main in CandyRunner");
  }
 }