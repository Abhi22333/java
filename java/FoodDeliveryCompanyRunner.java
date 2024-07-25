class FoodDeliveryCompanyRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in FoodDeliveryCompanyRunner ");
	  
	  FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
	  float cost=foodDeliveryCompany.cost;
	  String ownername=foodDeliveryCompany.ownername;
	  String logo=foodDeliveryCompany.logo;
	  long establishedYear=foodDeliveryCompany.establishedYear;
	  System.out.println("foodDeliveryCompany cost:"+ cost);
	  System.out.println("foodDeliveryCompany ownername:"+ownername);
	  System.out.println("foodDeliveryCompany logo:"+logo);
	  System.out.println("foodDeliveryCompany establishedYear:"+establishedYear);
	  
	  
	   System.out.print("end main in FoodDeliveryCompanyRunner");
  }
 }