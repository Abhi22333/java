class AutoRikshawRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in AutoRikshawRunner");
	  
	  AutoRikshaw autoRikshaw=new AutoRikshaw();
	  float cost=autoRikshaw.cost;
	  String ownername=autoRikshaw.ownername;
	  String colour=autoRikshaw.colour;
	  System.out.println("AutoRikshaw cost:"+ cost);
	  System.out.println("AutoRikshaw ownername:"+ownername);
	  System.out.println("AutoRikshaw colour:"+colour);
	  
	  
	   System.out.print("end main in AutoRikshawRunner");
  }
 }