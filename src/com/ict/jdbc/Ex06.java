package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//	스캐너를 이용해서 번호, 이름, 주소, 전화번호를 받아서 고객 테이블에 삽입 후 확인

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int custid = 0;
		String name = null;
		String address = null;
		String phone = null;
		
		System.out.print("번호 입력 : ");
		custid = scan.nextInt();
		scan.nextLine();
		System.out.print("이름 입력 : ");
		name = scan.nextLine();
		System.out.print("주소 입력 : ");
		address = scan.nextLine();
		System.out.print("전화번호 입력 : ");
		phone = scan.nextLine();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String ps = "1111";			//	반복되는 것은 메서드 만들어서 가져와 쓰자 
			
			conn = DriverManager.getConnection(url, user, ps);
			
			String sql = " insert into customer2 (custid, name, address, phone) "
					   + " values ( " + custid + ", '" + name + "', '" + address + "', '" + phone + "' )";
			
			//	** 너무 불편하다 >> PreparedStatement 사용
			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			if (result > 0) {
				sql = "select * from customer2";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
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
				stmt.close();
				conn.close();
				scan.close();	//	스캐너도 닫아주자
			} catch (Exception e2) {

			}
		}
		
		
		
		
		
	}
}
