class CabCompanyRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in CabCompanyRunner");
	  
	  CabCompany cabCompany=new CabCompany();
	  float cost=cabCompany.cost;
	  String ownername=cabCompany.ownername;
	  String logo=cabCompany.logo;
	  long establishedYear=cabCompany.establishedYear;
	  System.out.println("cabCompany cost:"+ cost);
	  System.out.println("cabCompany ownername:"+ownername);
	  System.out.println("cabCompany logo:"+logo);
	  System.out.println("cabCompany establishedYear:"+establishedYear);
	  
	  
	   System.out.print("end main in CabCompanyRunner");
  }
 }