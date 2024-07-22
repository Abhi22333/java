class CountryCode
{
public static String code(int code)
{
System.out.println("runnig code in countrycode");
if(code==91)
{
return "india";
}
else if(code==90)
{
return "turkey";
}
else if (code==960)
{
String countryName="maldives";
return countryName;
}
else if (code==974)
{
return "qatar";
}
else if(code==54)
{
return"argentina";
}
return " not found";
}
}