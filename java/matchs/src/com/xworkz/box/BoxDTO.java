package com.xworkz.box;

public class BoxDTO {
String brand;
double cost;

@Override
public String toString() {
	return "BoxDTO [brand=" + brand + ", cost=" + cost + ", getBrand()=" + getBrand() + ", getCost()=" + getCost()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public BoxDTO(String brand, double cost) {
	super();
	this.brand = brand;
	this.cost = cost;
}
}
