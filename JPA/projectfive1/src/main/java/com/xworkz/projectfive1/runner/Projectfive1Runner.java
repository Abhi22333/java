package com.xworkz.projectfive1.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.xworkz.projectfive1.Entity.Projectfive1Dto;
import com.xworkz.projectfive1.service.Projectfive1ServiceImp;

public class Projectfive1Runner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		List<Projectfive1Dto> list=new ArrayList();
		list.add(new Projectfive1Dto("abhishek", 23, "abhi@gmail.com", "9591868323"));
		list.add(new Projectfive1Dto("sachin", 22, "sachin@gmail.com", "9536563633"));
		list.add(new Projectfive1Dto("nandan", 24, "nandu@gmail.com", "9727673653"));
		list.add(new Projectfive1Dto("ajay", 23, "ajay@gmail.com", "9973631749"));
		list.add(new Projectfive1Dto("naga", 23, "naga@gmail.com", "7537635422"));
		
		for (Projectfive1Dto projectfive1Dto : list) {
			//em.persist(projectfive1Dto);
		}
		
		try {
			et.begin();
			
			et.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			
		}
		
		
		Projectfive1ServiceImp projectfive1ServiceImp = new Projectfive1ServiceImp();
		List<Projectfive1Dto> ref = projectfive1ServiceImp.getAllById(1);
		for (Projectfive1Dto projectfive1Dto : ref) {
			System.out.println(projectfive1Dto);
		}

		String ref1 = projectfive1ServiceImp.getlocationNameByPhoneNo("abhishek", "9591868323");
		System.out.println(ref1);
	}

}
