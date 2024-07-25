class BMTCRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in BMTCRunner ");
	  
	  BMTC bmtc=new BMTC();
	  float travilecost=bmtc.travilecost;
	  String driver=bmtc.driver;
	  String location=bmtc.location;
	  long busno=bmtc.busno;
	  System.out.println("bmtc travilecost:"+ travilecost);
	  System.out.println("bmtc driver:"+driver);
	  System.out.println("bmtc location:"+location);
	  System.out.println("bmtc busno:"+busno);
	  
	   System.out.print("end main in BMTCRunner");
  }
 }