class Dog1
{
	public static void guarding(String location)
	{
		System.out.println("running guarding in class dog");
		System.out.println("location :"+location);
		
	}
}
class House
{
	public static void watch(String location)
	{
		System.out.println("running watch in class dog");
		Dog.guarding(location);
	}
}

class DogRunner{
	public static void main(String[] args)
	{
		House.watch("GATE");
	}
}