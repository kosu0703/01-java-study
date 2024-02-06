package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//	book 테이블 모두 검색

public class Ex02 {
	public static void main(String[] args) {
		
		//	1. 자바를 오라클에 접속하기 위해 도와주는 클래스
		Connection conn = null;
		
		//	2. sql 구문
		Statement stmt = null;
		
		//	3. 결과 받기
		ResultSet rs = null;
		int result = 0;
		
		try {
			//	4. jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//	5. 접속하기 위한 정보 저장
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			//	6. 접속
			conn = DriverManager.getConnection(url, user, password);
			
			//	7. sql 작성
			String sql = " select * "
					   + " from book "
					   + " where bookname like '축구%'";
			
			//	8. sql 보내기 위한 구문 만들기
			stmt = conn.createStatement();
			
			//	9. 구문을 보내서 결과 받기
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.print(rs.getInt("price")+"\n");					
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
	}
}
