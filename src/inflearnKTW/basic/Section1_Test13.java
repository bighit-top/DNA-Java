package inflearnKTW.basic;

public class Section1_Test13 {

	public static void main(String[] args) {
		/*
		 * 13. 대소문자 변환
		 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
		 */

		String input = "StuDY";
		
		String result = solution1(input);
		System.out.println(result);
		
	}
	
	static String solution1(String str) {
		String answer = "";
		char[] chrArr = str.toCharArray();
		
		for(char x: chrArr) {
			String upperX = String.valueOf(x).toUpperCase();
			if(x==upperX.charAt(0)) answer += upperX.toLowerCase(); 
			else answer += upperX;
		}
		
		return answer;
	}
}
