class Company{
	public static void deliver(String item , String location)
	{
		System.out.println("company delivers items");
		System.out.println("item:" +item);
		System.out.println("location :"+location);
	}
}
//DeliveryVehicle---> deliver(String item,String location)--->Company.deliver(item,location);
class DeliveryVehicle
{
	public static void deliver(String item, String location)
	{
		System.out.println("running deliver in deliver vehicle");
		System.out.println("item :"+item);
		System.out.println("location :"+location);
		Company.deliver("duppatta" , "Athani");
	}
}
//DeliveryGuy--> deliver(String item)--->DeliveryVehicle.deliver(item,"FIXED")
class DeliveryGuy
{
	public static void deliver(String item)
	{
		System.out.println("deliver in class DeliveryGuy ");
		System.out.println("item:"+item);
		DeliveryVehicle.deliver("Kurti" , "Bengaluru");
	}
}
//main()----> DeliveryGuy.deliver("item");
class DeliveryRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in DeliveryRunner");
		DeliveryGuy.deliver("Footwear");
	}
}