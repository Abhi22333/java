package com.xworkz.projectfive1.service;

import java.util.List;

import com.xworkz.projectfive1.Entity.Projectfive1Dto;
import com.xworkz.projectfive1.repository.Projectfive1Repository;
import com.xworkz.projectfive1.repository.Projectfive1RepositoryImp;


public class Projectfive1ServiceImp implements Projectfive1Service {

	@Override
	public List<Projectfive1Dto> getAllById(int id) {
		Projectfive1Repository holidayRepositoryImp = new Projectfive1RepositoryImp();
		List<Projectfive1Dto> ref = holidayRepositoryImp.getAllById(id);
		return ref;
	}

	@Override
	public String getlocationNameByPhoneNo(String name, String no) {
		Projectfive1Repository projectfive1RepositoryImp = new Projectfive1RepositoryImp();
		String ref = projectfive1RepositoryImp.getlocationNameByPhoneNo(name, no);
		return ref;
	}
}
