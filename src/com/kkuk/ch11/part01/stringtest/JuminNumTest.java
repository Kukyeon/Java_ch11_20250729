package com.kkuk.ch11.part01.stringtest;

public class JuminNumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 주민번호 출력 프로그램 ㄱㄱ
		
		
		String jumin = "950729-1234123";
		
		char gender = jumin.charAt(7); // 인덱스는 0부터 시작 주의 또 주의 
		
		switch (gender) {
			case '1': // char 타입 문자와 비교 
			case '3': 	
				System.out.println("남자!");
				break;
				
			case '2':
			case '4':	
				System.out.println("여자!");
				break;
		
		}	
		
		
	}

}
