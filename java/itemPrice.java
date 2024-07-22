class iteamPrice{
	public static  String iteam(int price)
	{
		System.out.println("running iteam in iteamPrice");
		if (price==130)
		{
			return "vegbiryani";
		}
		else if (price==50)
		{
		return "eggRice";
		}
		else if (price==45)
	    {
			return "icecream";
		}
		else if (price==60)
		{
			return "masaladosa";
			
		}
		else if (price==35)
		{
			return "puri";
		}
		return "no Iteams";
	}
}