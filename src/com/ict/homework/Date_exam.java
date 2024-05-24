package com.ict.homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_exam {
	public static void main(String[] args) {
		try {
			
		//	주문 날짜 가져오기	
		String orderdate = "2024-03-25 14:54:52";
		
		//	포맷으로 바꾸기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//	Date 로 날짜형 변환
		Date order = sdf.parse(orderdate);
		
		//	현재날짜시간 구하기
		Calendar now = Calendar.getInstance();
		
		//	주문날짜시간 과 현재날짜시간 비교하기 (시간단위)
		long diff = ( now.getTimeInMillis() - order.getTime() ) / (1000 * 60 * 60);
		
		System.out.println(diff + "시간");
		
		if (diff <= 1) {
			//	배송상태에 setter 로 "상품준비중" 넣어주기 
		}else if (diff <= 24) {
			//	"배송중"
		}else if (diff <= 72) {
			//	"배송완료"
		}else {
			//	"구매확정"
		}
		
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
