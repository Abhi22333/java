class Chocolate{
String brand="Kit Kat";
double price;
int size;
String flavor;

public Chocolate(double price){
this.price=price;
}
public void setSize(int size){
this.size=size;
}
public void display(){
System.out.println("brand:"+this.brand);
System.out.println("price:"+this.price);
System.out.println("size:"+this.size);
System.out.println("flavor:"+this.flavor);

}
}