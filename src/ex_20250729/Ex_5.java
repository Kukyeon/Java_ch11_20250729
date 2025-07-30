package ex_20250729;

public class Ex_5 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//5. 다음 문자열에서 알파벳의 개수를 출력하는 프로그램을 작성하시오. (hint : 아스키 코드값 활용)
			//"Hello123, Java456"
			String str = "Hello123, Java456";
			int count = 0;
			
			
			for(int i = 0 ; i < str.length() ; i++) {
				char ch = str.charAt(i);
				
				
				//65 -> 대문자 A 아스키코드값, 90 -> 대문자 Z 아스키코드값
			if ((ch >=65 && ch <= 90) || (ch >= 97 && ch <= 122 )) {
				
				count++;
			} 
		}		System.out.println(count);

	}
}