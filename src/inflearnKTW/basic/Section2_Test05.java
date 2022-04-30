package inflearnKTW.basic;

import java.util.*;

public class Section2_Test05 {

	public static void main(String[] args) {
		/*
		 * 5. 등수 구하기
		 * N(1<=N<=100)명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
		 */
		
		int[] inputArr = {87, 89, 92, 100, 76};
		List<Integer> result = solution(inputArr);
		System.out.println(result);
	}
	
	static List<Integer> solution(int[] arr){
		List<Integer> answer = new ArrayList<>();
		int count;
		for(int i=0; i<arr.length; i++) {
			count = 1;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]<arr[j]) count++;
			}
			answer.add(count);
		}
		
		return answer;
	}
}
