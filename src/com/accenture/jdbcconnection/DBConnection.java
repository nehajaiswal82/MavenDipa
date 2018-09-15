package com.accenture.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	public void getConnectingDtring() {
		try {
				Class.forName("com.mysql:jdbc.Driver");
				Connection con = DriverManager.getConnection("", "", "");
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery("");
				int i=0;
				while(rs.next()) {
				System.out.println(rs.getBoolean(i));
				i++;
				}
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
