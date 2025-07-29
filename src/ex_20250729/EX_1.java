package ex_20250729;

import java.util.Scanner;

public class EX_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. "abcabcabc"에서 "ab"가 몇 번 나오는지 세어 주는 프로그램을 작성하시오.

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 문자열 입력 ");
		String str1 = scanner.nextLine(); // abcabcabc
		
		
		System.out.println(" 찾을 문자 입력 ");
		String str2 = scanner.nextLine(); // ab
		
		int count = 0;
		int index = 0;

		while ((index = str1.indexOf(str2, index)) != -1) {
			
			count++;
			index++;
			
		} 
	
		System.out.println(str1 + " 에서 " + str2 + " 는" + count + "번 나옵니다" );
		
}	
}