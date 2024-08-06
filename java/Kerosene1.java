class Kerosene
{
	double price;
	int quantity;
	boolean quality;
	
	Kerosene()
	{
		
	}
	Kerosene(double price,int quantity,boolean quality)
	{
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
	}
	Kerosene(boolean quality)
	{
		this.quality=quality;
	}
	Kerosene(double price)
	{
	    this.price=price;	
	}
	
}


class KeroseneRunner
{
	public static void main(String[] args)
	{
		Kerosene kerosene1=new Kerosene(55,1,true);
		Kerosene kerosene2=new Kerosene(false);
		Kerosene kerosene3=new Kerosene(60);
		
		System.out.println("price:"+kerosene1.price);
		System.out.println("quantity:"+kerosene1.quantity);
		System.out.println("quality:"+kerosene1.quality);
		System.out.println("quality:"+kerosene2.quality);
		System.out.println("price:"+kerosene3.price);

	}
}