package com.xworkz.matchbox;

import java.io.Serializable;

public class Fire implements Serializable{
Properties brand,cost;



public Properties getBrand() {
	return brand;
}

public void setBrand(Properties brand) {
	this.brand = brand;
}

public Properties getCost() {
	return cost;
}

public void setCost(Properties cost) {
	this.cost = cost;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((brand == null) ? 0 : brand.hashCode());
	result = prime * result + ((cost == null) ? 0 : cost.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Fire other = (Fire) obj;
	if (brand != other.brand)
		return false;
	if (cost != other.cost)
		return false;
	return true;
}
@Override
public String toString() {
	return "Fire [brand=" + brand + ", cost=" + cost + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

public Fire(Properties brand, Properties cost) {
	super();
	this.brand = brand;
	this.cost = cost;
}
}
