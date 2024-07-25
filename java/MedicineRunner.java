class MedicineRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in MedicineRunner ");
	  
	  Medicine medicine=new Medicine();
	  double cost=medicine.cost;
	  String name=medicine.name;
	  int quantity=medicine.quantity;
	  System.out.println("Medicine cost:"+ cost);
	  System.out.println("Medicine name:"+name);
	  System.out.println("Medicine quantity:"+quantity);
	  
	  medicine.cost=5;
	  medicine.name="Dollo";
	  medicine.quantity=10;
	  System.out.println("Medicine cost updated:"+medicine.cost);
	  System.out.println("Medicine name updated:"+medicine.name);
	  System.out.println("Medicine quantity updated:"+medicine.quantity);
	  
	   System.out.print("end main in MedicineRunner");
  }
 }