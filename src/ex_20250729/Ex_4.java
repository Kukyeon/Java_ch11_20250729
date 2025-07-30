package ex_20250729;

public class Ex_4 {
	public static void main(String[] args) {
	//4. "i like chopin" 문자열에서 첫글자만 대문자로 변경하여 출력하는 프로그램을 작성하시오.
	//ex) I Like Chopin
	//String repString = str.replace("길동", "유신"); //원본을 수정 시키지는 않음; 
		
		
		
		String str = "i like chopin";
		
		str = str.replace("i ", "I ");
		str = str.replace( " l", " L");
		str = str.replace(" c", " C");
		
		System.out.println(str); 
		
		
		System.out.println("------------------------------------"); 
		
//		String str = "i like chopin";
//		String str2 = "";
//		for(int i = 0 ; i < str.length() ; i++) {
//			if(i==0) { // 문장의 첫 글자 확인
//				// str.charAt(i) -> toUpperCase() 적용안됨
//				str2 = str2 + String.valueOf(str.charAt(0)).toUpperCase();
//			}else if(String.valueOf(str.charAt(i)).equals(" ")) {
//				str2 = str2 + str.charAt(i); // 빈칸삽입
//				str2 = str2 + String.valueOf(str.charAt(i+1)).toUpperCase();
//				i = i+1;
//				// 이미 다음 i값에 해당하는 문자는 대문자로 변경되어 삽입완료 -> 다음 문자에 대한 i값은 스킵
//			} else {
//				str2 = str2 + String.valueOf(str.charAt(i));
//			}
//		}
//		System.out.println(str2); 
		
		
		System.out.println("------------------------------------"); 
		
		
//		String str = "i like chopin";
//		String str2 = "";
//		
//		int str3 = 1;
//		
//		for(int i = 0 ; i < str.length() ; i++) {
//			
//			if (str3 == 1) {
//				str2 = str2 + String.valueOf(str.charAt(i)).toUpperCase();
//				str3 = 0;
//			} else if (String.valueOf(str.charAt(i)).equals(" ")) {
//				str2 = str2 + str.charAt(i);
//				str3 = 2;
//			} else if (str3 == 2) {
//				str2 = str2 + String.valueOf(str.charAt(i)).toUpperCase();
//				str3 = 0;
//			} else {
//				str2 = str2 + str.charAt(i);
//			}
//		}System.out.println(str2);
		
}
}