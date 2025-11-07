package org.fulldev.ticketing.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.fulldev.ticketing.model.Customer;

public class CustomerDao {
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		try (Connection conn = DatabaseUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT id, first_name, last_name, email FROM customer")) {
			while (rs.next()) {
				Customer c = new Customer();
				c.setId(rs.getInt("id"));
				c.setFirstName(rs.getString("first_name"));
				c.setLastName(rs.getString("last_name"));
				c.setEmail(rs.getString("email"));
				customers.add(c);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return customers;
	}

	/*
	private Connection getConnection() throws SQLException {
		final String url = "jdbc:h2:tcp://localhost:9092/ticketing";
		final String user = "sa";
		final String password = "";
		return DriverManager.getConnection(url, user, password);
	}
	*/
}
