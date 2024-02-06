package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

//	번호 받아서 변경

public class Ex10 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("변경할 번호 입력 : ");
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
			
			String sql = " update customer set name = ? , address = ? , phone = ? "
					   + " where custid = ?";
			
			pstmt = conn.prepareStatement(sql);
			
//   *****	//	? 해결할때 set 의 index 값은 SQL문에서 ? 의 순서와 같다.
			//	즉, 처음 나온 ? 가 name 이기 때문에 name 의 set 인덱스 값이 1
			//	address => 2 / phone => 3 / 마지막인 custid => 4
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setString(3, phone);
			pstmt.setInt(4, custid);
			
			result = pstmt.executeUpdate();
			
			if (result > 0) {
				sql = "select * from customer";
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
				scan.close();
			} catch (Exception e2) {

			}
		}

	}
}
