package inflearnKTW.basic;

public class Section1_Test11 {

	public static void main(String[] args) {
		/*
		 * 11. 대문자 찾기
		 *  한 개의 문자열을 입력받아 해당 문자열에 알파벳 대문자가 몇 개 있는지 알아내는 프로그램 을 작성하세요.
		 */
		
		String inputStr = "KoreaTimeGood";
		int result = solution1(inputStr);
		
		System.out.println(result);
		
	}
	
	static int solution1(String str) {
		int answer = 0;
		char[] arr = str.toCharArray();
		
		for(char x : arr) {
			String upperX = String.valueOf(x).toUpperCase();
			if(x == upperX.charAt(0)) answer++;
		}
		
		return answer;
	}

}
