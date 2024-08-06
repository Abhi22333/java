class Speaker{
String brand;
double cost;
int size;
String output="Stereo";

public Speaker(int size){
this.size=size;
}
public void setBrand(String brand){
this.brand=brand;
}
public void display(){
System.out.println("brand:"+this.brand);
System.out.println("cost:"+this.cost);
System.out.println("size:"+this.size);
System.out.println("output:"+this.output);

}
}