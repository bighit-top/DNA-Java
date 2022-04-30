package inflearnKTW.basic;

public class Section1_Test14 {

	public static void main(String[] args) {
		/*
		 * 14. 가장 긴 문자열
		 * N개의 문자열이 입력되면 그 중 가장 긴 문자열을 출력하는 프로그램을 작성하세요.
		 */
		
		String[] inputArr = {"teacher", "time", "student", "beautiful", "good"};
		int inputNum = 5;
		
		String result = solution1(inputArr, inputNum);
		System.out.println(result);
	}
	
	static String solution1(String[] strArr, int num) {
		String answer = "";
		int length = 0;
		for(String x: strArr) {
			if(length<x.length()) {
				answer = x;
				length = x.length();
			}
		}
		return answer;
	}

}
