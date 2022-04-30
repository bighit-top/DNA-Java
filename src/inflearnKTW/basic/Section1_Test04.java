package inflearnKTW.basic;

public class Section1_Test04 {

	public static void main(String[] args) {
		/*
		 * 4. 1부터 N까지 합 출력하기
		 * 자연수 N이 입력되면 1부터 N까지의 합을 출력하는 프로그램을 작성하세요.
		 */
		
		int input = 10;
		
		int result1 = solution1(input);
		
		System.out.println(result1);

	}
	
	static int solution1(int num) {
		int answer = 0;
		for(int i=1; i<=num; i++) {
			answer += i;
		}
		return answer;
	}

}
