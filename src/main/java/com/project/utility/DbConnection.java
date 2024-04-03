package com.project.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	private static Connection con = null;
	
//	public static Connection establiConnection() {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spiderman", "akshay", "akshay");
//			return con;
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		return con;
//	}
	
	public static void main(String[] args) {
		//Connection con = DbConnection.establiConnection();
		Connection con = DbConnection.oracleConnection();
		if(con!=null) {
			System.out.println("Connected");
		}
	}
	
	public static Connection oracleConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "akshay", "akshay");
			return con;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
