package ex_20250729;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "banana" 에서 중복된 문자를 제거하면 "ban" 이 됩니다. 중복으로 나오는 문자를 제거하여 
		//"banana"를 "ban"으로 출력하는 프로그램을 작성하시오.

		Scanner scanner = new Scanner(System.in);
		//banana
		System.out.println("문자를 입력하시오");
		String a = scanner.nextLine();
		
		String str = "";
		
		for(int i = 0 ; i < a.length() ; i++) {
			String b = String.valueOf(a.charAt(i));
			if(str.indexOf(b) == -1) {
				str += b;
			}
		}
		System.out.println(str);
		
		
		
		
		
	}

}
