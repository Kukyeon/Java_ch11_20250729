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
		
		
}
}