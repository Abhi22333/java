class AlcoholBrandRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in AlcoholBrandRunner ");
	  
	  AlcoholBrand alcoholBrand=new AlcoholBrand();
	  double cost=alcoholBrand.cost;
	  String name=alcoholBrand.name;
	  int quantity=alcoholBrand.quantity;
	  System.out.println("AlcoholBrand cost:"+ cost);
	  System.out.println("AlcoholBrand name:"+name);
	  System.out.println("AlcoholBrand quantity:"+quantity);
	  
	  alcoholBrand.cost=140;
	  alcoholBrand.name="old monk";
	  alcoholBrand.quantity=120;
	  System.out.println("AlcoholBrand cost updated:"+alcoholBrand.cost);
	  System.out.println("AlcoholBrand name updated:"+alcoholBrand.name);
	  System.out.println("AlcoholBrand quantity updated:"+alcoholBrand.quantity);
	  
	   System.out.print("end main in AlcoholBrandRunner");
  }
 }