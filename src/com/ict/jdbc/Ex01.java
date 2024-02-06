package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//	**jar : 자바로 압축한 파일이다. 보통 라이브러리에 사용, 클래스들로 이루어졌다.
//			(자바에서 오라클을 사용할 수 있도록 오라클이 만든 클래스들)

//	1.
//	자바와 오라클을 연결해주는 드라이버 (ojdbcXXX.jar) 가 필요하다.
//	그런데 sqldeveloper 에 존재한다.
//	해당 드라이버를 찾아서 util 폴더에 복사해서 붙여넣기 해주자.

//	2.
//	이클립스의 프로젝트에서 마우스 우클릭 > 중간위치 Build Path > 마지막 Configure
//		> 세번째 Libraries > modulepath > 두번째 add External jars
//		> util 가서 드라이버 열기


public class Ex01 {
	public static void main(String[] args) {
		
		//	1. 자바를 오라클에 접속할 수 있도록 도와주는 클래스
		Connection conn = null;
		
		//	2. SQL 구문을 작성
		Statement stmt = null;
		
		//	3-1. 보낸 SQL 구문의 결과를 받는 클래스(select 일때)
		ResultSet rs = null;
		
		//	3-2. 결과를 받는 변수 (select 아닐때)
		int result = 0;
		
		try {
		//	4. jdbc 드라이버 로딩 : 오라클, MySQL, mariaDB 다 다르다.
		//						왜냐하면 회사마다 제공하는 드라이버가 다르기 때문이다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//	class 파일은 JVM 이 해석하고 실행해서 java 파일으로 바꿔서 우리에게 보여준다.
			//	즉, 회사만 알고 있고 고객은 class 내용을 알 수 없다.
			
		//	5. 오라클과 연결하기 위한 정보	(원래는 코딩 안에 직접 넣지않고 따로 만들어서 사용한다.)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
		//	6. 오라클에 연결하기
			conn = DriverManager.getConnection(url, user, password);
			
		//	7. SQL 작성하기
//			String sql = "select * from customer";
			String sql = " select * "
					   + " from customer "
					   + " where custid = 3";
			
		//	8. SQL 보내기 위해 구문을 만든다.
			stmt = conn.createStatement();	//	만들 때 통으로 만든다. 고정되어있다.
			
		//	9. SQL 보내서 결과 받기
			//	9-1. select 문인 경우 ( ResultSet 으로 받자 )
			rs = stmt.executeQuery(sql);
			
			//	9-2. insert / update / delete 인 경우 ( int 로 받자 )
			//result = stmt.executeUpdate(sql);
			
		//	10. 결과 출력하기
		//		rs.getXXXX(index => 1부터)
			while (rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\n");
			}
			System.out.println();
			
			//	book 테이블 가져오기 
//			sql = "select * from book";
//			rs = stmt.executeQuery(sql);
//			while (rs.next()) {
//				System.out.print(rs.getInt("bookid")+"\t");
//				System.out.print(rs.getString("bookname")+"\t");
//				System.out.print(rs.getString("publisher")+"\t");
//				System.out.print(rs.getInt("price")+"\n");	
//			}
			
		} catch (Exception e) {

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
