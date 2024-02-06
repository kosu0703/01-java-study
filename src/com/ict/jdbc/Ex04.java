package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//	고객 테이블에서 이강인 정보 삭제하기 ( delete from )

public class Ex04 {
	public static void main(String[] args) {
		
		//	오라클에 접속을 위한 초기값들
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			//	접속
			Class.forName("oracle.jdbc.driver.OracleDriver");		
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";	
			conn = DriverManager.getConnection(url, user, password);
			
			//	sql
			String sql = " delete from customer "
					   + " where name like '이강인' ";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);	//	 delete 문
			
			if (result > 0) {
				System.out.println("삭제 성공");
				
				sql = "select * from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);	//	select 문
				while (rs.next()) {
					System.out.print(rs.getInt("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.print(rs.getString("phone")+"\n");
				}
			} else {
				System.out.println("삭제 실패");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
		
		
	}
}
