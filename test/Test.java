package test;

import java.sql.Connection;

import database.JDBCUtil;

public class Test {
	public static void main(String[] args) {
		Connection con = JDBCUtil.getConnection();
		
		System.out.println(con);
		JDBCUtil.printInfo(con);
		JDBCUtil.closeConnection(con);
	}
}
