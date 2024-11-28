package com.xworkz.course.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.course.dto.CollegeDto;

public class CollegeRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			List<CollegeDto> list = new ArrayList();
			list.add(new CollegeDto("abhishek", 23, "abhi@gmail.com", "9591868323"));
			list.add(new CollegeDto("sachin", 22, "sachin@gmail.com", "9536563633"));
			list.add(new CollegeDto("nandan", 24, "nandu@gmail.com", "9727673653"));
			list.add(new CollegeDto("ajay", 23, "ajay@gmail.com", "9973631749"));
			list.add(new CollegeDto("naga", 23, "naga@gmail.com", "7537635422"));

			for (CollegeDto dto : list) {
				CollegeDto collegeDto = new CollegeDto();
				collegeDto.setName(dto.getName());
				collegeDto.setAge(dto.getAge());
				collegeDto.setEmail(dto.getEmail());
				collegeDto.setPhoneNo(dto.getPhoneNo());

				em.persist(collegeDto);

			}

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
