package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//	PreparedStatement

public class Ex07 {
	public static void main(String[] args) {
		
//		1. 자바를 오라클에 접속할 수 있도록 도와주는 클래스
			Connection conn = null;
			
			//	2. SQL 구문을 작성
			PreparedStatement pstmt = null;
			
			//	3-1. 보낸 SQL 구문의 결과를 받는 클래스(select 일때)
			ResultSet rs = null;
			
			//	3-2. 결과를 받는 변수 (select 아닐때)
			int result = 0;
			
			Scanner scan = new Scanner(System.in);
			
			try {
				System.out.print("검색 번호 받기 : ");
				int custid = scan.nextInt();
				
			//	4. jdbc 드라이버 로딩 
				Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//	5. 오라클과 연결하기 위한 정보	
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "c##ictedu";
				String password = "1111";
				
			//	6. 오라클에 연결하기
				conn = DriverManager.getConnection(url, user, password);
				
			//	7. SQL 작성하기
				
//		**		//	? : 동적 바인딩 변수 => 지금은 값을 모르고 실행할때 값을 알 수 있다.
				String sql = "select * from customer where custid = ?";
		
			//	8. SQL 보내기 위해 구문을 만든다.
				pstmt = conn.prepareStatement(sql);
				
//		**		//	보내기 전에 ? 를 처리하자.
				pstmt.setInt(1, custid);
				
			//	9. SQL 보내서 결과 받기
				//	9-1. select 문인 경우 ( ResultSet 으로 받자 )
				rs = pstmt.executeQuery();
				
				//	9-2. insert / update / delete 인 경우 ( int 로 받자 )
				//result = pstmt.executeUpdate();
				
			//	10. 결과 출력하기
			//		rs.getXXXX(index => 1부터)
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}

			} catch (Exception e) {
				System.out.println(e);
			} finally {
				try {
					rs.close();
					pstmt.close();
					conn.close();
				} catch (Exception e2) {

				}
			}
			
			
		
		
	}
}
