class ForestRunner
{
public static void main(String[] forestInfos)
{
if(forestInfos.length==4)
{
	System.out.println("Getting 4 refernce in method arguments");
	String name=forestInfos[0];
	String area=forestInfos[1];
	String establishedYear=forestInfos[2];
	String state=forestInfos[3];
	System.out.println("Name:"+name);
	System.out.println("Area:"+area);
	System.out.println("EstablishedYear:"+establishedYear);
	System.out.println("State:"+state);
}
else{
	System.out.println("Not enough refrence");
}
}
}