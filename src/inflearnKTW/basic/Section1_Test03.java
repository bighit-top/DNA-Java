package inflearnKTW.basic;

public class Section1_Test03 {

	public static void main(String[] args) {
		/*
		 * 3. 연필 개수
		 * 연필 1 다스는 12자루입니다.
		 * 학생 1인당 연필을 1자루씩 나누어 준다고 할 때
		 * N명이 학생수 를 입력하면 필요한 연필의 다스 수를 계산하는 프로그램을 작성하세요.
		 */
		
		int input = 25;		
		int result1 = solution1(input);
		
		System.out.println(result1);
		
	}
	
	static int solution1(int num) {
		int answer = (int)Math.ceil((double)num/12);
		return answer;
	}

}
