class ChainRunner
{
  public static void main(String[] args)
  {
   int value=Chain.carat();
   System.out.println("carat return type: "+value);
   double cost =Chain.costPerGram();
   System.out.println("costPerGram return type: "+cost);
   String name=Chain.type();
   System.out.println("type return type: "+name);
   String name1=Chain.quality();
   System.out.println("quality return type: "+name1);
   int value1=Chain.quantity();
   System.out.println("quantity return type: "+value1);
   String name2=Chain.wastage();
   System.out.println("wastage return type: "+name2); 
   double cost1=Chain.serviceCharge();
   System.out.println("serviceCharge return type: "+cost1);
   String name3=Chain.GST();
   System.out.println("GST return type: "+name3);
  }
}