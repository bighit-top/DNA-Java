package inflearnKTW.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Section1_Test06 {

	public static void main(String[] args) {
		/*
		 * 6.홀수
		 * 7개의 자연수가 주어질 때, 이들 중 홀수인 자연수들을 모두 골라 그 합을 구하고,
         * 고른 홀수들 중 최소값을 찾는 프로그램을 작성하세요.
         * 예를 들어, 7개의 자연수 12,77,38,41,53,92,85가 주어지면
         * 이들 중 홀수는 77,41,53,85이므로
         * 그 합은 256이 되고,
         * 홀수들 중 최소값은 41이 된다.
		 */
		
		int[] inputArr = {12, 77, 38, 41, 53, 92, 85};
		
		int[] result1 = solution1(inputArr);
		
		System.out.println(result1[0]);
		System.out.println(result1[1]);
		
		ArrayList<Integer> result2 = solution2(inputArr);
		System.out.println(result2.get(0));
		System.out.println(result2.get(1));

	}
	
	static int[] solution1(int[] arr) {
		
		int[] answer = new int[2];
		int sum = 0;
		int min = Arrays.stream(arr).max().getAsInt();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				sum+=arr[i];
				if(min>arr[i]) min=arr[i];
			}
		}
		
		answer[0] = sum;
		answer[1] = min;
		
		return answer;
	}
	
	
	//arrayList로 반환
	static ArrayList<Integer> solution2(int[] arr) {

		ArrayList<Integer> answer = new ArrayList<Integer>();
		int sum = 0;
		int min = Arrays.stream(arr).max().getAsInt();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				sum+=arr[i];
				if(min>arr[i]) min=arr[i];
			}
		}
		
		answer.add(sum);
		answer.add(min);
		
		return answer;
	}

}