class LensRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in LensRunner");
		
		Lens lens=new Lens("Photochromic lenses",700);
		System.out.println("Lens type:"+lens.type);
		System.out.println("Lens cost:"+lens.cost);
		
		Lens lens1=new Lens("High index lenses",600);
		System.out.println("Lens1 type:"+lens1.type);
		System.out.println("Lens1 cost:"+lens1.cost);
		
		Lens lens2=new Lens("Single vision lenses",1000);
		System.out.println("Lens2 type:"+lens2.type);
		System.out.println("Lens2 cost:"+lens2.cost);
		
		Lens lens3=new Lens("Multifocal lenses",900);
		System.out.println("Lens3 type:"+lens3.type);
		System.out.println("Lens3 cost:"+lens3.cost);
		
		Lens lens4=new Lens("Progressive lenses",900);
		System.out.println("Lens4 type:"+lens4.type);
		System.out.println("Lens4 cost:"+lens4.cost);
		
		Lens lens5=new Lens("Tinted lenses",800);
		System.out.println("Lens5 type:"+lens5.type);
		System.out.println("Lens5 cost:"+lens5.cost);
		
		Lens lens6=new Lens("Polarized Lenses",400);
		System.out.println("Lens6 type:"+lens6.type);
		System.out.println("Lens6 cost:"+lens6.cost);
		
		Lens lens7=new Lens("Anti-reflective",900);
		System.out.println("Lens7 type:"+lens7.type);
		System.out.println("Lens7 cost:"+lens7.cost);
		
		Lens lens8=new Lens("Bifocal Lenses",1700);
		System.out.println("Lens8 type:"+lens8.type);
		System.out.println("Lens8 cost:"+lens8.cost);
		
		Lens lens9=new Lens("Blue Light",2600);
		System.out.println("Lens9 type:"+lens9.type);
		System.out.println("Lens9 cost:"+lens9.cost);
		
		Lens lens10=new Lens("Trifocals lenses",1700);
		System.out.println("Lens10 type:"+lens10.type);
		System.out.println("Lens10 cost:"+lens10.cost);
		
		
		System.out.println("end main in LensRunner");
	}
}