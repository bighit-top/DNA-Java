package inflearnKTW.basic;

import java.util.*;

public class Section2_Test01 {

	public static void main(String[] args) {
		/*
		 * 1. 큰 수 출력하기
		 * N(1<=N<=100)개의 정수를 입력받아,
		 * 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
		 * (첫 번째 수는 무조건 출력한다.)
		 */
		
		int [] inputArr = {7, 3, 9, 5, 6, 12};
		
		List<Integer> result = solution1(inputArr);
		
		System.out.println(result);
		
	}
	
	static List<Integer> solution1(int [] arr){
		
		List<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1]<arr[i]) answer.add(arr[i]);
		}
		
		return answer;
	}
	
}
