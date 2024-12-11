package com.xworkz.projectfive1.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.projectfive1.Entity.Projectfive1Dto;

public  class Projectfive1RepositoryImp implements Projectfive1Repository {
	@Override
	public List<Projectfive1Dto> getAllById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<Projectfive1Dto> list = em.createNamedQuery("getAll").setParameter("setId", id).getResultList();

		try {
			et.begin();

			et.commit();

		} catch (Exception e) {
			if (et.isActive())
				et.rollback();
		} finally {
			em.close();
			emf.close();
		}

		return list;
	}

	@Override
	public String getlocationNameByPhoneNo(String name, String no) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Object object = em.createNamedQuery("getlocationNameByPhoneNo").setParameter("setname", name)
				.setParameter("setNo", no).getSingleResult();
		String string = (String) object;
		try {
			et.begin();

			et.commit();

		} catch (Exception e) {
			if (et.isActive())
				et.rollback();
		} finally {
			em.close();
			emf.close();
		}

		return string;
	}

}

