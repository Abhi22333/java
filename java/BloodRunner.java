class BloodRunner
{
   public static void main(String[] args)
   {
     char value=Blood.group();
     System.out.println("group return type: "+value);
     String name=Blood.personName();
     System.out.println("personName return type: "+name);
     double cost=Blood.cost();
     System.out.println("cost return type: "+cost);
     boolean ref=Blood.hospitalTested();
     System.out.println("hospitalTested return type: "+ref);
     boolean ref1=Blood.sicknessOrNot();
     System.out.println("sicknessOrNot return type: "+ref1);
     boolean ref2=Blood.donateOrNot();
     System.out.println("donateOrNot return type: "+ref2);
   }
}