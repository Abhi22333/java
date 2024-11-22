package com.xworkz.runner;


import com.xworkz.rsiproject.repo.VehicleRepository;
import com.xworkz.rsiproject.repo.VehicleRepositoryImp;
import com.xworkz.service.VehicleService;
import com.xworkz.service.VehicleServiceImp;


public class VehicleServiceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleRepository repository=new VehicleRepositoryImp();
		VehicleService service=new VehicleServiceImp(repository);
		service.persist();
		service.merge();
		boolean res=service.clear();
		System.out.println(res);
		String res1=service.search();
		System.out.println(res1);

	}
	

}
