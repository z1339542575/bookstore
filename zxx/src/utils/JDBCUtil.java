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
	//��ǰ�������������� ��������
	public static Connection getConnection(){
		try {
			//��������
			Class.forName(DRIVER_NAME);
			//��������
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return conn;
	}
	
	//�º������ر�����
	public static void closeConnection(Connection conn){
		try {
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	
}
