//Declare a class Train,with below methods with parameters
//1.book method which takes source,destination
//2.book method which takes source,destination,quantity
//3.book method which takes source,destination,quantity,price
//4.cancel method which takes ticketNo
//5.cancel method which takes source,destination

class Train{
	public static void book(String source , String destination)
	{
		System.out.println("running source and destination");
		System.out.println("source :"+source);
		System.out.println("destination :"+destination);
	}
	public static void book(String source , String destination ,int quantity)
	{
		System.out.println("running source ,destination and quantity");
		System.out.println("source :"+source);
		System.out.println("destination :"+destination);
		System.out.println("quantity :"+quantity);
	}
	public static void book(String source , String destination ,int quantity , double price)
	{
		System.out.println("running source ,destination ,quantity and price");
		System.out.println("source :"+source);
		System.out.println("destination :"+destination);
		System.out.println("quantity :"+quantity);
		System.out.println("price :"+price);
    }
	public static void cancel(long ticketNo)
	{
		System.out.println("running ticketNoin cancel method");
		System.out.println("ticketNo :"+ticketNo);
	}
	public static void cancel(String source , String destination)
	{
		System.out.println("running source and destination");
		System.out.println("source :"+source);
		System.out.println("destination :"+destination);
	}

}
class ChukubukuTrain
{
	public static void main(String[] args)
	{
		Train.book("SBC" ,"Miraj");
		Train.book("Belagavi" , "UgarKhurd" , 4440);
		Train.book("Vijayapur" , "Yeshwantpura" , 4540 , 1290.9980);
		Train.cancel(1234567890);
		Train.cancel("Ahmadnagar" , "Hyderabad");
	}
}