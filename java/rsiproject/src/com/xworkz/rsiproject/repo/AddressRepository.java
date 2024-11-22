package com.xworkz.rsiproject.repo;

public interface  AddressRepository {
	boolean save();

	int update();

	void delete();

	String read();
}
