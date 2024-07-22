class Paint
{
public static void buy(String brandname)
{
	System.out.println("the brandname is");
System.out.println("brandname:"+brandname);
}


public static void wall(String brand ,String color)
{ 
System.out.println("brand:"+ brand);
System.out.println("color:" +color);
}


public static void buy(String brand,int price)
{
	System.out.println("the paint brand and price");
System.out.println("brand:" + brand);
System.out.println("price :" + price);
}


public static void buy(String color,String type,int price)
{
	System.out.println("the color type, and price");
	System.out.println("color:"+color);
	System.out.println("type:"+type);
	System.out.println("price:"+price);
}

}

class Painter
{
public static void main(String[]args)
{
paint.buy("nerolac");
paint.wall("exceltotal","white");
paint.buy("asianpaint",2000);
paint.buy("red","interlock",150);
train.booking("manglore"," banglore");
train.booking("manglore","banglore",1);
train.booking("manglore","banglore",2,355);
train.booking(575956);
}




}