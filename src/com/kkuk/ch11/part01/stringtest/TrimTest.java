package com.kkuk.ch11.part01.stringtest;

import java.util.Scanner;

public class TrimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("좋아하는 음식을 입력하세요 : ");
		String str = scanner.nextLine();
		
		System.out.println(str.strip()); // 문자열 양쪽에 있는 공백제거, 원본은 수정되지않음
		str = str.strip();
		System.out.println(str.length());
		// 공백 자르기 
		
		// trim  , strip  두개 다 공백 자르기는 가능하나 , / 스트립이 범위가 더 넓다 
		// 트림은 공백만 제거 되며, 스트립은 특수문자에 의해 생긴 공백도 제거됨 
		
		
	}

}
