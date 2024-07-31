class PrintingMachineRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in PrintingMachineRunner");
		
		PrintingMachine printingMachine=new PrintingMachine("HP","low");
		System.out.println("PrintingMachine model:"+printingMachine.model);
		System.out.println("PrintingMachine speed:"+printingMachine.speed);
		
		PrintingMachine printingMachine1=new PrintingMachine("canon","high");
		System.out.println("PrintingMachine model:"+printingMachine1.model);
		System.out.println("PrintingMachine speed:"+printingMachine1.speed);
		
		PrintingMachine printingMachine2=new PrintingMachine("Epson","high");
		System.out.println("PrintingMachine model:"+printingMachine2.model);
		System.out.println("PrintingMachine speed:"+printingMachine2.speed);
		
		PrintingMachine printingMachine3=new PrintingMachine("Sony","low");
		System.out.println("PrintingMachine model:"+printingMachine3.model);
		System.out.println("PrintingMachine speed:"+printingMachine3.speed);

	PrintingMachine printingMachine4=new PrintingMachine("Dell","low");
		System.out.println("PrintingMachine model:"+printingMachine4.model);
		System.out.println("PrintingMachine speed:"+printingMachine4.speed);
		
		PrintingMachine printingMachine5=new PrintingMachine("lenovo","low");
		System.out.println("PrintingMachine model:"+printingMachine5.model);
		System.out.println("PrintingMachine speed:"+printingMachine5.speed);

		PrintingMachine printingMachine6=new PrintingMachine("Lexmark","high");
		System.out.println("PrintingMachine model:"+printingMachine6.model);
		System.out.println("PrintingMachine speed:"+printingMachine6.speed);
		
		PrintingMachine printingMachine7=new PrintingMachine("Xerox","Medium");
		System.out.println("PrintingMachine model:"+printingMachine7.model);
		System.out.println("PrintingMachine speed:"+printingMachine7.speed);

		PrintingMachine printingMachine8=new PrintingMachine("Apple","high");
		System.out.println("PrintingMachine model:"+printingMachine8.model);
		System.out.println("PrintingMachine speed:"+printingMachine8.speed);

		PrintingMachine printingMachine9=new PrintingMachine("Brother","low");
		System.out.println("PrintingMachine model:"+printingMachine9.model);
		System.out.println("PrintingMachine speed:"+printingMachine9.speed);

		PrintingMachine printingMachine10=new PrintingMachine("Ricoh","high");
		System.out.println("PrintingMachine model:"+printingMachine10.model);
		System.out.println("PrintingMachine speed:"+printingMachine10.speed);

		System.out.println("End main in PrintingMachineRunner");
	}
}