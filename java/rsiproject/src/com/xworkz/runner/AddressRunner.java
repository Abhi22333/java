package com.xworkz.runner;

import com.xworkz.rsiproject.repo.AddressRepository;
import com.xworkz.rsiproject.repo.AddressRepository.*;
import com.xworkz.rsiproject.repo.AddressRepositoryImp;
import com.xworkz.service.AddressService;
import com.xworkz.service.AddressServiceImp;


public class AddressRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressRepository addressRepository=new AddressRepositoryImp();
		AddressService addressSevice=new AddressServiceImp(addressRepository);
		boolean result=addressSevice.push();
		System.out.println(result);
		int result1=addressSevice.refresh();
		System.out.println(result1);
		addressSevice.remove();
		String result2= addressSevice.load();
		System.out.println(result2);
	}

}
