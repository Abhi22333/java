package com.xworkz.runner;

import com.xworkz.rsiproject.repo.MachineRepository;
import com.xworkz.rsiproject.repo.MachineRepository.*;
import com.xworkz.rsiproject.repo.MachineRepositoryImp;
import com.xworkz.service.MachineService;
import com.xworkz.service.MachineServiceImp;


public class MachineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MachineRepository machineRepository = new MachineRepositoryImp();
		MachineService machineService = new MachineServiceImp(machineRepository);
		machineService.save();
		int update = machineService.update();
		System.out.println(update);
		int delete = machineService.delete();
		System.out.println(delete);
		int read = machineService.read();
		System.out.println(read);

	}
	

}
