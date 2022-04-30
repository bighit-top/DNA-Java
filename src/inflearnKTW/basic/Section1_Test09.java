package inflearnKTW.basic;

public class Section1_Test09 {

	public static void main(String[] args) {
		/*
		 * 9. A를 #으로
		 * 대문자로 이루어진 영어단어가 입력되면 단어에 포함된 ‘A'를 모두 ’#‘으로 바꾸어 출력하는 프로그램을 작성하세요.
		 */
		
		String input = "BANANA";
		
		//배열
		String result1 = solution1(input);
		System.out.println(result1);
		
		//내장함수
		String result2 = solution2(input);
		System.out.println(result2);
		
	}	
	
	// 배열로 처리
	static String solution1(String str) {
		String answer = "";
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(String.valueOf(arr[i]).equals("A")) {
				arr[i] ="#".charAt(0);
			}
		}
		answer = String.valueOf(arr);
		return answer;
	}
	
	// 내장함수로 처리
	static String solution2(String str) {
		String answer = str.replaceAll("[A]", "#"); //정규표현식
//		String answer = str.replace("A","#");
		return answer;
	}

}
