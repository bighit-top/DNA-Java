package inflearnKTW.basic;

public class Section1_Test15 {

	public static void main(String[] args) {
		/*
		 * 15. 가운데 문자열 출력
		 * 소문자로 된 단어(문자열)가 입력되면 그 단어의 가운데 문자를 출력하는 프로그램을 작성하세요.
		 * 단 단어의 길이가 짝수일 경우 가운데 2개의 문자를 출력합니다.
		 */
		
		String input = "study";
		
		String result = solution1(input);
		System.out.println(result);

	}
	
	static String solution1(String str) {
		String answer = "";
		int mid = str.length()/2;
		if(str.length()%2!=0) answer = String.valueOf(str.charAt(mid));
		else answer = str.substring(mid-1, mid+1);
		return answer;
	}
	
}
