class PlaceRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in PlaceRunner ");
	  
	  Place place=new Place();
	  String famousfor=place.famousfor;
	  String name=place.name;
	  long distance=place.distance;
	  int noofpalace=place.noofpalace;
	  System.out.println("Place name:"+ name);
	  System.out.println("Place famousfor:"+famousfor);
	  System.out.println("Place distance:"+distance);
	  System.out.println("Place noofpalace:"+noofpalace);
	  
	  place.name="Mysore";
	  place.famousfor="Palace";
	  place.distance=125;
	  place.noofpalace=8;
	  System.out.println("Place name updated:"+place.name);
	  System.out.println("Place famousfor updated:"+place.famousfor);
	  System.out.println("Place distance updated:"+place.distance);
	  System.out.println("Place noofpalace updated:"+place.noofpalace);
	  
	   System.out.print("end main in PlaceRunner");
  }
 }