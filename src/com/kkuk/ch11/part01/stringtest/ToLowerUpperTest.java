package com.kkuk.ch11.part01.stringtest;

public class ToLowerUpperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 소문자 . 대문자 변경 
		
		String str1 = "KOREA"; // 대문자
		String str2 = "japan"; // 소문자
		String str3 = "JAPAN";
		
		System.out.println(str1.toLowerCase());  // 모두 소문자로 변경
		System.out.println(str1); // 원본을 건들이진 않음 , 사용시 새롭게 저장 후ㅡ 사용
		System.out.println(str2.toUpperCase()); // 모두 대문자로 변경 
		System.out.println(str2);
		System.out.println(str3);
		str2 = str2.toUpperCase(); // 대문자열로 변환후 덮어쓰기 (오버라이딩)
		
		
		if(str2.equals(str3)) {
			System.out.println("같은 문자열입니다.");
		} else {
			System.out.println("다른 문자열입니다.");
		}
		
		
	}

}
