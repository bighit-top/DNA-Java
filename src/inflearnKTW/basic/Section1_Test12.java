package inflearnKTW.basic;

public class Section1_Test12 {

	public static void main(String[] args) {
		/*
		 * 12. 대문자로 통
		 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자로 모두 통일하여 문자열을 출력 하는 프로그램을 작성하세요.
		 */
		
		String input = "ItisTimeToStudy";
		String result = solution1(input);
		
		System.out.println(result);
	}
	
	static String solution1(String str) {
		String answer = str.toUpperCase();
		return answer;
	}

}
