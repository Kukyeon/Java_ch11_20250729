package com.kkuk.ch11.part02;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calendar calNow = Calendar.getInstance(); // 캘린더는 추상클래스라 이런형식으로 인스턴스 생성가능
		
		int year1 = calNow.get(Calendar.YEAR);  // 연도 표시 2025
		int year2 = calNow.get(Calendar.MONTH) + 1; // 월 표시 , 
		int year3 = calNow.get(Calendar.DAY_OF_MONTH); // 날자 표시
		
		int apm = calNow.get(Calendar.AM_PM);
		int hour = calNow.get(Calendar.HOUR);
		int min = calNow.get(Calendar.MINUTE);
		int sec = calNow.get(Calendar.SECOND);
		
		
		
		
		System.out.println(year1 + " 년");
		System.out.println(year2 + " 월");
		System.out.println(year3 + " 일");
		
		System.out.println(year1 + "년 " + year2 + "월 " + year3 + "일 ");
		System.out.println(apm + hour + "시 " + min + "뷴 " + sec + "초");
		
		
		//요일출력하게
		
		int weekday = calNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("오늘의 요일 " + weekday);
		System.out.println("오늘의 요일 " + Calendar.TUESDAY);
		
		if(weekday == Calendar.TUESDAY) {
			System.out.println(" 오늘은 화요일 ");
		}else {
			System.out.println("오늘은 화요일이 아니다");
		}
		
	}

}
