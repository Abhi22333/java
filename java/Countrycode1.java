class Countrycode1
{
	public static String code(int code )
	{
		System.out.println("running the countrycode");
	
		if(code==91)
		{
			return "India";
		}
		 else if(code==61)
		{
			return"Australia";
		}
		 else if(code==55)
		{
		String countryName="maldives";
            return countryName;
		}
		
			return"Brazil";
		}
		 else if(code==44)
		{
			return "England";
		
		}
		else if(code==86)
		{
			return"China";
		}
		
	       System.out.println("Not found");
		   return"Not found";
		
	}
	
}
}