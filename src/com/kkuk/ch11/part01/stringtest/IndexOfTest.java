package com.kkuk.ch11.part01.stringtest;

public class IndexOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "대한민국 일본";
		
		int index = str.indexOf("일본");
		System.out.println(index);
		// 문자열 안에 포함되어있는 숫자 시작 인덱스 찾아줌
		// \indexof  특정 문자열을 찾아 위치에 해당하는 인덱스값을 반환 해주고 없으면 -1 이 반환됩니다.
		
		if(str.indexOf("서울") != -1 ) { // 일치하는 문자열을 찾지못하면 -1 이 반환됨
			System.out.println("포함되어있습니다.");
			
		} else {
			System.out.println("민국이 포함되어있지 않습니다.");
		}
		
		
		System.out.println(str.length());
		
		
	}

}
