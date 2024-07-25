class RapidoRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in RapidoRunner ");
	  
	  Rapido rapido=new Rapido();
	  float cost=rapido.cost;
	  String ownername=rapido.ownername;
	  String colour=rapido.colour;
	  String location=rapido.location;
	  System.out.println("rapido cost:"+ cost);
	  System.out.println("rapido ownername:"+ownername);
	  System.out.println("rapido colour:"+colour);
	  
	  
	   System.out.print("end main in RapidoRunner");
  }
 }