package inflearnKTW.basic;

import java.util.Arrays;

public class Section1_Test05 {

	public static void main(String[] args) {
		/*
		 * 5. 최솟값 구하기
		 * 7개의 수가 주어지면 그 숫자 중 가장 작은 수를 출력하는 프로그램을 작성하세요.
		 */
		
		int[] inputArr = {5, 3, 7, 11, 2, 15, 17};

		int result1 = solution1(inputArr);
		int result2 = solution2(inputArr);
		int result3 = solution3(inputArr);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
	
	static int solution1(int[] arr) {
		int answer = arr[0];
		for(int i=1; i<arr.length; i++) {
			answer = answer>arr[i] ? arr[i]:answer;
		}
		return answer;
	}
	
	//내장함수1
	static int solution2(int[] arr) {
		int answer = arr[0];
		for(int x : arr) answer = Math.min(x,answer);
		return answer;
	}
	
	//내장함수2
	static int solution3(int[] arr) {
		int answer = Arrays.stream(arr).min().getAsInt();
		return answer;		
	}
	
}
