class MedicineRunner{
	public static void main (String[] args){
		System.out.println("start main in MedicineRunner");
		if (args.length==4)
		{
			String name=args[0];
			String manufacture=args[1];
			String price=args[2];
			String quantity=args[3];
			
			long convertedmanufacture=Long.parseLong(manufacture);
			float convertedprice=Float.parseFloat(price);
			int convertedquantity=Integer.parseInt(quantity);
			
			Medicine.medicineinfo(name,convertedmanufacture,convertedprice,convertedquantity);	
		}
		else
		{
			System.out.println("3 args are required");
		}
		
		System.out.println("end main in MedicineRunner");
	}
}