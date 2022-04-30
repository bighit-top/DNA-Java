package inflearnKTW.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Section1_Test08 {

	public static void main(String[] args) {
		/*
		 * 8. 일곱 난쟁이
		 * 왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다.
		 * 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
		 * 아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다.
		 * 뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
		 * 아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
		 */
		
		int[] inputArr = {20, 7, 23, 19, 10, 15, 25, 8, 13};
		
		List<Integer> result = solution1(inputArr);
		for(Object x: result) {
			System.out.println(x);
		}
		
		
	}
	
	static List<Integer> solution1(int[] arr) {
		
		List<Integer> answer = IntStream.of(arr).boxed().collect(Collectors.toList());
		int sum = Arrays.stream(arr).sum();
		int index1 = 0;
		int index2 = 0;
		
		for (int i=0; i<arr.length-1; i++) {
			boolean check = false;
			for (int j=1; j<arr.length; j++) {
				if (sum-(arr[i]+arr[j])==100) {
					index1 = i;
					index2 = j;
					check = true;
					break;
				}
			}
			if(check) break;
		}

		answer.remove(index2);
		answer.remove(index1);
		
		return answer;
		
	}
}
