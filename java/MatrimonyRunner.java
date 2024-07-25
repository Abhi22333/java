class MatrimonyRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in MatrimonyRunner ");
	  
	  Matrimony matrimony=new Matrimony();
	  String name=matrimony.name;
	  String logo=matrimony.logo;
	  long apppassword=matrimony.apppassword;
	  int account=matrimony.account;
	  System.out.println("Matrimony name:"+ name);
	  System.out.println("Matrimony logo:"+logo);
	  System.out.println("Matrimony apppassword:"+apppassword);
	  System.out.println("Matrimony account:"+account);
	  
	  matrimony.name="Abhishek";
	  matrimony.logo="flower";
	  matrimony.apppassword=1234556;
	  matrimony.account=2;
	  System.out.println("Matrimony name updated:"+matrimony.name);
	  System.out.println("Matrimony logo updated:"+matrimony.logo);
	  System.out.println("Matrimony apppassword updated:"+matrimony.apppassword);
	  System.out.println("Matrimony account updated:"+matrimony.account);
	  
	   System.out.print("end main in MatrimonyRunner");
  }
 }