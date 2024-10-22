package com.xworkz.collection.countriesRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email email1 = new Email("sachin@example.com", "charan@example.com", "Meeting Reminder",
				"Don't forget about the meeting tomorrow at 10 AM.");
		Email email2 = new Email("ajay@example.com", "dk@example.com", "Project Update",
				"The project is on track for the deadline.");
		Email email3 = new Email("charan@example.com", "nandan@example.com", "Happy Birthday!",
				"Wishing you a fantastic birthday filled with joy.");
		Email email4 = new Email("raj@example.com", "ram@example.com", "Invoice",
				"Please find attached the invoice for this month.");
		Email email5 = new Email("raju@example.com", "likith@example.com", "Invitation",
				"You are cordially invited to our annual gala.");

		Collection<Email> collection = new ArrayList<Email>();
		collection.add(email1);
		collection.add(email2);
		collection.add(email3);
		collection.add(email4);
		collection.add(email5);

		Email email6 = new Email("raju@example.com", "likith@example.com", "Invitation",
				"You are cordially invited to our annual gala.");

		System.out.println("Before");
		collection.forEach(ref -> System.out.println(ref));
		System.out.println("After");
		boolean res = collection.remove(email6);
		System.out.println(res);
		collection.forEach(ref -> System.out.println("After remove method"+ref));
		System.out.println("************************************");
		collection.add(email6);
		collection.forEach(ref -> System.out.println("After add method"+ref));
		System.out.println("************************************");

		Collection<EmailDTO> collection2=new ArrayList<Email>();
		collection2.addAll(collection);
		collection2.forEach(ref -> System.out.println("After addAll method"+ref));
		System.out.println("************************************");
		
		collection2.removeAll(collection);
		collection2.forEach(ref -> System.out.println("After removeAll method"+ref));
		System.out.println("************************************");
		System.out.println("isempty  "+collection2.isEmpty());
		System.out.println("************************************");

		
		System.out.println(collection.contains(email1));
		System.out.println("************************************");
		collection2.addAll(collection);
		System.out.println(collection2.containsAll(collection));
		System.out.println("************************************");
		
		Iterator<Email> iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(collection.size());
		collection.clear();
		collection.forEach(ref -> System.out.println("After clear method"+ref));
		System.out.println("************************************");
		
	

}
