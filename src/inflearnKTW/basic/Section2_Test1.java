package inflearnKTW.basic;

import java.util.ArrayList;

public class Section2_Test1 {

	public static void main(String[] args) {
		/*
		 * 1. 큰 수 출력하기
		 * N(1<=N<=100)개의 정수를 입력받아,
		 * 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
		 * (첫 번째 수는 무조건 출력한다)
		 */
		
		int[] inputArr = {7, 3, 9, 5, 6, 12};
		ArrayList<Integer> result1 = solution1(inputArr);
		System.out.println(result1);
		
	}
	
	static ArrayList<Integer> solution1(int[] arr) {
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(arr[0]);
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[i-1]) answer.add(arr[i]);
		}
		
		return answer;
	}

}
