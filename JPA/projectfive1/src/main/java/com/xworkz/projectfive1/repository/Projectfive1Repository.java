package com.xworkz.projectfive1.repository;

import java.util.List;

import com.xworkz.projectfive1.Entity.Projectfive1Dto;

public interface Projectfive1Repository {

	List<Projectfive1Dto> getAllById(int id);
	
	String getlocationNameByPhoneNo(String name,String no);
}







