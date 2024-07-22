class Train1
{
	public static void travels(String source,String destination)
	{
		System.out.println("running information in Train with two String parameter");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
	}
	public static void bulkygoods(String source,String destination,int quantity)
	{
		System.out.println("running information in Train with two String parameter & one int");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
		System.out.println("Quantity:"+quantity);
	}
	public static void convenient(String source,String destination,int quantity,double price)
	{
		System.out.println("running information in Train with two String & one int & one double parameter");
	    System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price:"+price);
				
	}
	public static void cancelled(int ticketNo)
	{
		
	System.out.println("running information in Train with cancling with ticketNo");
	System.out.println("TicketNo:"+ticketNo);
	}
	public static void charges(String source,String destination)
	{
		System.out.println("running information in Train with cancling with ticketNo with two string");
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
	}
	
	public static void main(String[] args)
	{
		Train1.travels("Hubli","Banglore");
		Train1.bulkygoods("Maharastra","pune",3);
		Train1.convenient("Karwar","Mumbai",5,450.0);
		Train1.cancelled(4567);
		Train1.charges("Mantrayala","Dharwad");
	}
	
}
