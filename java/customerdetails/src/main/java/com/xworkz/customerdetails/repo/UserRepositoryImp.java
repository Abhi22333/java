package com.xworkz.customerdetails.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.customerdetails.constants.UserConnection;
import com.xworkz.customerdetalis.dto.UserDTO;

public class UserRepositoryImp implements UserRepository {

	@Override
	public boolean save(UserDTO userDTO) {

		boolean saved = true;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(UserConnection.URL.getValue(), UserConnection.USERNAME.getValue(),
					UserConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into student_table values(?,?,?,?,?,?)");
			preparedStatement.setString(1, userDTO.getFirstName());
			preparedStatement.setString(2, userDTO.getLastName());
			preparedStatement.setString(3, userDTO.getEmail());
			preparedStatement.setLong(4, userDTO.getPhoneNo());
			preparedStatement.setInt(5, userDTO.getAge());
			preparedStatement.setString(6, userDTO.getAddress());

			int value = preparedStatement.executeUpdate();
			if (value > 0) {
				System.out.println("saved into db");
			} else {
				saved = false;
				System.err.println("not saved into db");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return saved;
	}

}
