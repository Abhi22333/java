//Declare a class yourwish,with least 5 method with parameter

class MenClothing
{
	public static void kurti(String brand , double price)
	{
		System.out.println("running brand and price");
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
	}
	public static void tops(String brand ,String color, char size, double price)
	{
		System.out.println("running brand, Color,size, price");
		System.out.println("brand :"+brand);
		System.out.println("color :"+color);
		System.out.println("size :"+size);
		System.out.println("price :"+price);
	}
	public static void cropTop(String brand , double price , String sleeveType)
	{
		System.out.println("running brand , price , sleeveType");
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
		System.out.println("sleeveType :"+sleeveType);
	}
	public static void bottomWear(String brand , double price , String type , int size)
	{
		System.out.println("running brand , price ,type,size");
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
		System.out.println("type :"+type);
		System.out.println("size :"+size);
	}
	public static void dress(String brand , double price , String type ,long itemNo )
	{
		System.out.println("running brand , price , type , itemNo");
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
		System.out.println("type :"+type);
		System.out.println("itemNo :"+itemNo);
	}
	}class WomenClothingRunner
{
	public static void main (String[] args)
	{
		WomenClothing.kurta("RAMRAJ" , 1299.29);
		WomenClothing.jeans("Levi's" , "BLACK" ,'M' , 2999.99);
		WomenClothing.tshirt("PUMA" , 599.78645 , "ROUND NECK");
		WomenClothing.hat("MAX" ,999.9999, "LONG", 34);
		WomenClothing.shirt("Trend" ,2149.89 , "FULL" , 30096353);
	}
}