package dlz.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

public class DBConnection {

	public static void main(String[] args) {
		System.out.println(getConnection());
	}


	/**
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		String forName ="com.mysql.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/paperstore";
		String dbUser = "root";
		String dbPwd = "123456";
		Connection conn = null;
		try {
			Class.forName(forName);
			java.sql.DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
		} catch (Exception e) {
			System.out.println("连接出错");
		}
		return conn;
	}

	/**
	 * 
	 * @param conn
	 */
	public static void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
