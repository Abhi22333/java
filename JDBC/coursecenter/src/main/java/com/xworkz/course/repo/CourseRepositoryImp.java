package com.xworkz.course.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.course.dto.CourseDTO;
import com.xworkz.coursecenter.constants.CourseConnection;

public class CourseRepositoryImp implements CourseRepository {

	public boolean save1(CourseDTO courseDTO) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(CourseConnection.URL.getValue(),
					CourseConnection.USERNAME.getValue(), CourseConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into institue_table values(?,?,?,?,?,?,?)");
			preparedStatement.setInt(1, courseDTO.getId());
			preparedStatement.setString(2, courseDTO.getName());
			preparedStatement.setString(3, courseDTO.getEmail());
			preparedStatement.setString(4, courseDTO.getPassword());
			preparedStatement.setLong(5, courseDTO.getNumber());
			preparedStatement.setInt(6, courseDTO.getAge());
			preparedStatement.setString(7, courseDTO.getAddress());

			int value = preparedStatement.executeUpdate();
			if (value > 0) {
				System.out.println("saved into database");
			} else
				System.err.println("not saved into database");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public String getNameByPhone(String Phone) {
		String ref = null;
		String ref1 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(CourseConnection.URL.getValue(),
					CourseConnection.USERNAME.getValue(), CourseConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = connection
					.prepareStatement("select name,email from institue_table where number=?");
			preparedStatement.setString(1, Phone);
			ResultSet resultSet1 = preparedStatement.executeQuery();

			while (resultSet1.next()) {
				ref = resultSet1.getString("name");
				ref1 = resultSet1.getString("email");
				System.out.println(ref);
				System.out.println(ref1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ref + " and " + ref1;

	}

	@Override
	public boolean save(CourseDTO courseDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	public int deleteDataById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
