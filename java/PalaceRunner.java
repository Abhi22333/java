class PalaceRunner
{
public static void main(String[] palaceInfos)
{
if(palaceInfos.length==4)
{
	System.out.println("Getting 4 refernce in method arguments");
	String name=palaceInfos[0];
	String location=palaceInfos[1];
	String builtBy=palaceInfos[2];
	String builtYear=palaceInfos[3];
	System.out.println("Name:"+name);
	System.out.println("Location:"+location);
	System.out.println("BuiltBy:"+builtBy);
	System.out.println("BuiltYear:"+builtYear);
}
else{
	System.out.println("Not enough refrence");
}
}
}