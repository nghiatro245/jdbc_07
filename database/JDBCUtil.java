package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.jdbc.Driver;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection c = null;
		
		try {
			//Đăng ký mySQL Driver với drivermanager
			DriverManager.registerDriver(new Driver());
			
			//Các thông số
			String url= "jdbc:mySQL://localhost:3306/nhasach";
			String username= "root";
			String password= "";
						
			//Tạo kết nối
			c= DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return c;
	}
	
	public static void closeConnection(Connection con) {
		try {
			if(con!=null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void printInfo(Connection c) {
		try {
			if(c!=null) {
				java.sql.DatabaseMetaData mtdt = c.getMetaData();
				System.out.println(mtdt.getDatabaseProductName());
				System.out.println(mtdt.getDatabaseProductVersion());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
