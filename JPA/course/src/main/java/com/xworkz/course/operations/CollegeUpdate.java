package com.xworkz.course.operations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.course.dto.CollegeDto;

public class CollegeUpdate {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();

			CollegeDto collegeDto = new CollegeDto();
			int value = em.createQuery(
					"update CollegeDto table set table.name=:setname ,table.email=:setemail where table.phoneNo=:setphoneNo")
					.setParameter("setname", "abhishek tc").setParameter("setemail", "abhi@gmail.com")
					.setParameter("setphoneNo", "9591868323").executeUpdate();

			if (value > 0)
				System.out.println("updated");

			else
				System.err.println("error");

			
			et.commit();

		} catch (Exception e) {
			if (et.isActive())
				et.rollback();
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}

	}

}
