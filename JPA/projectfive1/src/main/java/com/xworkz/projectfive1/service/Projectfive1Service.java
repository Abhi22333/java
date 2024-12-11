package com.xworkz.projectfive1.service;

import java.util.List;

import com.xworkz.projectfive1.Entity.Projectfive1Dto;

public interface Projectfive1Service {

List<Projectfive1Dto> getAllById(int id);
	
	String getlocationNameByPhoneNo(String name,String no);
}
