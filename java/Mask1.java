class Mask
{
	double cost;
	char size;
	String material;
	
    Mask()
	{
		
	}
	
	 Mask(double cost)
	{
		this.cost=cost;
		
	}
	Mask(char size)
	{
		this.size=size;
	}
    Mask(String material)
	{
		this.material=material;
	}
	Mask(double cost,char size,String material)
	{
		this.cost=cost;
		this.size=size;
		this.material=material;
	}
	Mask(double cost,char size)
	{
		this.cost=cost;
		this.size=size;
		
	}
}

class MaskRunner
{
	public static void main(String[] args)
	{
	Mask mask1=new Mask();
	Mask mask2=new Mask(100);	
	Mask mask3=new Mask('M');
	Mask mask4=new Mask("polyster");
	Mask mask5=new Mask(150,'M',"cotton");
 	Mask mask6=new Mask(200,'L');
	
	System.out.println("cost:"+mask2.cost);
	System.out.println("size:"+mask3.size);
	System.out.println("material:"+mask4.material);
	System.out.println("cost:"+mask5.cost);
	System.out.println("size:"+mask5.size);
	System.out.println("material:"+mask5.material);
	System.out.println("cost:"+mask6.cost);
	System.out.println("size:"+mask6.size);

	}
}