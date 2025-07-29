package com.kkuk.ch11.part02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date nowDate = new Date();
		System.out.println(nowDate.toString()); 
		// 현재시간 출력 .toString() 을 적어서 문자열로 출력 없어도 출력되긴함
		
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일 "); // 날자만 출력
		String date2 = format1.format(nowDate);
		System.out.println(date2);
		
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초 ");
		String date3 = format2.format(nowDate);
		System.out.println(date3);
		
		nowDate.getTime();
		System.out.println(nowDate.getTime() + (2*60*60*1000)); // 현재 시간 기준으로 2시간 후
		
		long newtime = nowDate.getTime() + (2*60*60*1000);
		nowDate.setTime(newtime);
		System.out.println("현재 시간으로 부터 2시간 후 : " + nowDate); // 두시간 후 
		
	}

}
