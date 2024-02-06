package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//	고객 테이블에 이강인 정보 삽입하기 ( insert into ~ values )

public class Ex03 {
	public static void main(String[] args) {
		//	접속을 위한 클래스들
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			//	오라클 드라이버
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//	접속 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			//	접속하기
			conn = DriverManager.getConnection(url, user, password);
			
			//	sql
			String sql = " insert into customer (custid, name, address, phone) "
					   + " values(6, '이강인', '대한민국 제주도', '000-1234-9876') ";
			
			//	구문 
			stmt = conn.createStatement();
			
			//	보내고 결과 받기 (insert 문)
			result = stmt.executeUpdate(sql);
			
			//	삽입 성공하면 result = 1 이다.
			if (result > 0) {
				System.out.println("삽입성공");
				
				//	성공했을 때 select 문을 이용해서 삽입된 내용을 보자
				sql = "select * from customer";
				
				stmt = conn.createStatement();	//	create 이기때문에 항상 새로 만들어야 한다.
				
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
					
			}else {
				System.out.println("삽입실패");	//	기본키가 없어서 중복되도 상관이 없다.
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
