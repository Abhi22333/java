package com.xworkz.sdcard.service;

import com.xworkz.sdcard.dto.SdcardDTO;
import com.xworkz.sdcard.repository.SdcardRepository;
import com.xworkz.sdcard.repository.SdcardRepositoryImpl;

public class SdcardServiceImpl implements SdcardService {

	public boolean save(SdcardDTO sdcardDTO) {

		boolean isvalid = true;

		if (sdcardDTO == null) {
			isvalid = false;
		}

		if (sdcardDTO.getFirstName().length() < 3 || sdcardDTO.getFirstName().isEmpty()) {
			System.out.println("Data is incorrect");
			isvalid = false;
		}

		if (sdcardDTO.getLastName().length() < 3 || sdcardDTO.getLastName().isEmpty()) {
			System.out.println("Data is incorrect");
			isvalid = false;
		}

		if (!(sdcardDTO.getEmail().contains("@gmail") && sdcardDTO.getEmail().endsWith(".com")
				|| sdcardDTO.getEmail().endsWith(".in"))) {
			System.out.println("Data is in correct");
			isvalid = false;
		}

		if (sdcardDTO.getPassword().length() < 5) {
			System.out.println("Dtat is incorrect");
			isvalid = false;
		}

		if (isvalid) {
			SdcardRepositoryImpl sdcardRepositoryImpl = new SdcardRepositoryImpl();
			return sdcardRepositoryImpl.save(sdcardDTO);
		} else {
			System.out.println("Data validation failed, not saving.");
			return false;
		}
	}
}