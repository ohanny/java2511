package org.fulldev.ticketing.dao;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	private static final String URL = "jdbc:h2:tcp://localhost:9092/ticketing";
	private static final String USER = "sa";
	private static final String PASSWORD = "";

	static {
		var schemaUrl = DatabaseUtil.class.getClassLoader().getResource("scripts/schema.sql");
		var dataUrl = DatabaseUtil.class.getClassLoader().getResource("scripts/data.sql");
		try (Connection conn = getConnection()) {
			conn.createStatement().execute("RUNSCRIPT FROM 'file:" + schemaUrl.toURI() + "'");
			conn.createStatement().execute("RUNSCRIPT FROM 'file:" + dataUrl.toURI() + "'");
		} catch (SQLException | URISyntaxException e) {
			e.printStackTrace();
		}
	}

	/*
	static {
		//var schemaUrl = DatabaseUtil.class.getClassLoader().getResource("scripts/schema.sql");
		//var dataUrl = DatabaseUtil.class.getClassLoader().getResource("scripts/data.sql");
		try (Connection conn = getConnection()) {
			conn.createStatement().execute("RUNSCRIPT FROM 'classpath:scripts/schema.sql'");
			conn.createStatement().execute("RUNSCRIPT FROM 'classpath:scripts/data.sql'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
