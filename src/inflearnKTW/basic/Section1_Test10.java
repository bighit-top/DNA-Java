package inflearnKTW.basic;

public class Section1_Test10 {

	public static void main(String[] args) {
		/*
		 * 10.
		 * 한 개의 문자열을 입력받고,
		 * 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
		 * 문자열의 길이는 100을 넘지 않습니다.
		 */
		
		String inputStr = "COMPUTERPROGRAMMING";
		char inputChar = 'R';
		
		int result = solution1(inputStr, inputChar);
		System.out.println(result);
		
	}
	
	static int solution1(String str, char chr) {
		int answer = 0;
		char[] strArr = str.toCharArray();
		for(char x: strArr) {
			if(x==chr) answer++;
		}
		return answer;
	}

}
