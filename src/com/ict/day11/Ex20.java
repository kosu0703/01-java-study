package com.ict.day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex20 {
	public static void main(String[] args) {
		
		//	3.
		//	LocalDate 클래스	(java 8.0)
		
		//	1) LocalDate 
		//		날짜 정보만
		LocalDate cDate = LocalDate.now();
		System.out.println(cDate);	//	오늘날짜 년월일
		
		LocalDate cDate2 = LocalDate.of(2023,12,28);	//	특정 날짜 지정	
		System.out.println(cDate2);						//	월 1~12 , 일 1~31			
		
		//	두 날짜간의 차이 비교
		System.out.println(ChronoUnit.YEARS.between(cDate, cDate2));
		System.out.println(ChronoUnit.MONTHS.between(cDate, cDate2));
		System.out.println(ChronoUnit.DAYS.between(cDate, cDate2));
		
			
		//	2) LocalTime
		//		시간 정보만
		LocalTime cTime = LocalTime.now();
		System.out.println(cTime);
		
		LocalTime cTime2 = LocalTime.of(23, 59,53);	//	특정 시간 지정
		System.out.println(cTime2);					//	시 0~23 , 분 0~59 , 초 0~59
		
		
		//	3) LocalDateTime
		//		날짜, 시간 정보 모두
		LocalDateTime cdt = LocalDateTime.now();
		System.out.println(cdt);
		
		LocalDateTime cdt2 = LocalDateTime.of(cDate2, cTime2);	//	특정 날짜, 시간 지정
		System.out.println(cdt2);
		
		System.out.println();
		
		
		//	plus**() 	현재 날짜에서 더하기 
		//	minus**()	현재 날짜에서 빼기
		System.out.println(cdt.plusYears(7));
		System.out.println(cdt.plusMonths(7));
		System.out.println(cdt.plusDays(7));
		System.out.println(cdt.minusHours(9));
		System.out.println(cdt.minusMonths(20));
		
		
		
		
		
		
		
	}
}
