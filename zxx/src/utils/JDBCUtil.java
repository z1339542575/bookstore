package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	public static final String DRIVER_NAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=TestJDBC";
	public static final String USERNAME = "sa";
	public static final String PASSWORD = "123456";
	

	public static Connection conn = null;
	//事前工作：加载驱动 建立连接
	public static Connection getConnection(){
		try {
			//加载驱动
			Class.forName(DRIVER_NAME);
			//建立连接
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return conn;
	}
	
	//事后工作：关闭连接
	public static void closeConnection(Connection conn){
		try {
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	
}
