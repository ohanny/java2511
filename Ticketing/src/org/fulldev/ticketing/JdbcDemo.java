package org.fulldev.ticketing;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.fulldev.ticketing.dao.CustomerDao;
import org.fulldev.ticketing.model.Customer;

public class JdbcDemo {
	public static void main(String[] args) throws SQLException, IOException {
		CustomerDao customerDao = new CustomerDao();
	
		System.out.println("=== Clients ===");
		
		List<Customer> customers = customerDao.findAll();
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
}
