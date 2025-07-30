package ex_20250729;

import java.util.Scanner;

public class EX_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. "abcabcabc"에서 "ab"가 몇 번 나오는지 세어 주는 프로그램을 작성하시오.

//		String str = "abcabcabc";
//		
//		int count = 0;
//		
//		for(int i=0 ; i < str.length() ; i++) {
//			if(str.charAt(i) == 'a' && str.charAt(i+1) == 'b') {
//				count++;
//			}
//		}
//		System.out.println(count); 
		
		System.out.println("----------------------------------------------"); 
		
//		String str = "abcabcabc";
//		String target = "ab";
//		int count = 0;
//		
//		for(int i=0 ; i<=str.length() - target.length() ; i++) {
//			if(str.substring(i, i + target.length()).equals(target)) {
//					//1회전 i값 0)0~2 -> "ab"
					//2회전 i값 1)1~3 -> "bc"
					//3회전 i값 2)2~4 -> "ca"  반복
//				count++;
//			}
//			
//		}	System.out.println(count);
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 문자열 입력 ");
		String str1 = scanner.nextLine(); // abcabcabc
		
		
		System.out.println(" 찾을 문자 입력 ");
		String str2 = scanner.nextLine(); // ab
		
		int count = 0;
		int index = 0;

		while ((index = str1.indexOf(str2, index)) != -1) {
			// 인덱스는 입력한 문자열을 한바퀴씩 돌면서 입력한 ab를 확인, 이후 카운팅 반복 
			count++;
			index++;
			
		} 
	
		System.out.println(str1 + " 에서 " + str2 + " 는" + count + "번 나옵니다" );
		
}	
}