//declare a class Paint , with below method with parameters
//1.method which takes brand
//2.method which takes brand,color
//3.method which takes brand,price
//4.method which takes color,type,price
class Paint{
	public static void homePaint(String brand)
	{
		System.out.println("running homePaint with brand");
		System.out.println("brand :"+brand);
	}
	public static void homePaint(String brand , String color)
	{
		System.out.println("running brand and color");
		System.out.println("brand :"+brand);
		System.out.println("color :"+color);
	}
	public static void homePaint(String brand , double price)
	{
		System.out.println("running brand and price");
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
	}
	public static void homePaint(String color , String type , double price)
	{
		System.out.println("running color , type and price");
		System.out.println("color :"+color);
		System.out.println("type :"+type);
		System.out.println("price :"+price);
	}
}



class PaintRunnerr
{
	public static void main(String[] args)
	{
		Paint.homePaint("Asian");
		Paint.homePaint("Burger" , "OffWhite");
		Paint.homePaint("Nippon" , 1999.9999);
		Paint.homePaint("RoseGold" , "EnamelPaint" , 8999.786486);
	}
}