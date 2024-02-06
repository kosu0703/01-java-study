package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

//	스캐너로 번호, 이름, 주소, 전화번호 받아서 고객 테이블에 삽입하기 

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("번호 입력 : ");
		int custid = scan.nextInt();
		scan.nextLine();
		System.out.print("이름 입력 : ");
		String name = scan.nextLine();
		System.out.print("주소 입력 : ");
		String address = scan.nextLine();
		System.out.print("전화번호 입력 : ");
		String phone = scan.nextLine();		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String ps = "1111";
			conn = DriverManager.getConnection(url, user, ps);
			
//	*****	//	모르는 변수 만큼 ? 로 
			String sql = " insert into customer3 (custid, name, address, phone) "
					   + " values (? , ? , ? , ?) ";
			
			pstmt = conn.prepareStatement(sql);
			
//	*****	//	? 해결 위치
			pstmt.setInt(1, custid);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.setString(4, phone);
			
			result = pstmt.executeUpdate();
			
			if (result > 0) {
				sql = "select * from customer3";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}				
			}else {
				System.out.println("실패");
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
