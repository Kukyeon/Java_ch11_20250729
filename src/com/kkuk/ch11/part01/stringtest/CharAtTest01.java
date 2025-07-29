package com.kkuk.ch11.part01.stringtest;

public class CharAtTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "korea oop program";
		String str2 = "아아 배고프다";
		
		System.out.println(str.charAt(2)); // 문자열중에서 원하는 문자 1글자만 반환해주는 메소드;
		// 배열 인덱스 값을 가져와줌 ㅇㅇ
		
		
		int count = 0;
		for(int i = 0 ; i<str.length() ; i++ ) { // for 문으로 글자 추출
			//System.out.println(str.charAt(i));
			
			if(str.charAt(i) == 'o') {
				System.out.println("문자열 내에 소문자 o 가 포함되어 있습니다.");
				count++;
			}
		}
			
		
		System.out.println("문자열 내에 소문자 o 가 "+ count +" 개 있습니다.");
		
	}

}
