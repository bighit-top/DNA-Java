package inflearnKTW.basic;

public class Section1_Test16 {

	public static void main(String[] args) {
		/*
		 * 16. 중복문자제거
		 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
		 * 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
		 */
		
		String input = "ksekkset";
		
		String result1 = solution1(input);
		System.out.println(result1);
		
		String result2 = solution2(input);
		System.out.println(result2);
		
	}
	
	static String solution1(String str) {
		String answer = "";
		for(int i=0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
		}
		return answer;
	}
	
	static String solution2(String str) {
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			if(!answer.contains(String.valueOf(str.charAt(i)))) {
				answer += String.valueOf(str.charAt(i));
			}
		}
		return answer;
	}

	@Override
	public String toString() {
		return "Section1_Test16 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
