package com.xworkz.inheritance.assingment;

public class Shoe 
{
 public	String brand;
 public double cost;
	
 public Shoe()
 {
	 System.out.println("Created Shoe using no-arg const"); 
	 }
 
 void safeGuard() {
     System.out.println("running is being safeguarded");
 }

 void enhanceWalk() {
     System.out.println("Walking enhanced by Shoe");
 }
}
