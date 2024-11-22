package com.xworkz.sdcard.repository;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

import com.xworkz.sdcard.dto.SdcardDTO;

public class SdcardRepositoryImpl {
	public boolean save(SdcardDTO sdcardDTO) {
		boolean isValid = false;
		Connection connection = null;
		try {
			// connection
			connection = DriverManager.getConnection(DbConnection.URL.getValue(), DbConnection.USERNAME.getValue(),
					DbConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = null;

			preparedStatement = connection.prepareStatement("insert into loginbase values(?, ?, ?, ?)");
			preparedStatement.setString(1, sdcardDTO.getFirstName());
			preparedStatement.setString(2, sdcardDTO.getLastName());
			preparedStatement.setString(3, sdcardDTO.getEmail());
			preparedStatement.setString(4, sdcardDTO.getPassword());

			int value = preparedStatement.executeUpdate();

			if (value > 0) {
				System.out.println("Data saved");
				isValid = true;
			} else {
				System.out.println("Data does not saved");
				isValid = false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isValid;
	}
}
