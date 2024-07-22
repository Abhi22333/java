class train
{
public static void  booking(String source, String destination)
{
System.out.println( "booking the ticket from manglore to banglore");
System.out.println("source:"+source);
System.out.println("destination"+destination);
}
public static void booking(String source,String destination,int quantity)
{
	System.out.println("booking the ticket");
	System.out.println("source:"+source);
	System.out.println("destination:"+destination);
	System.out.println("total number of passanger:"+quantity);	
}
public static void booking(String source,String destination,int quantity,int price)
{
	System.out.println("booking the ticket and price");
	System.out.println("source:"+source);
	System.out.println("destination:"+destination);
	System.out.println("total number of passanger:"+quantity);	
	System.out.println("ticket price:"+price)
} 
public static void booking(int ticket)
{
System.out.println("cancling the ticket no:"ticket);	

}

}