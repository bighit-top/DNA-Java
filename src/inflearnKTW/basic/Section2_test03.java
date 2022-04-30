package inflearnKTW.basic;

import java.util.*;

public class Section2_test03 {

	public static void main(String[] args) {
		/*
		 * 3. 가위 바위 보
		 * A, B 두 사람이 가위바위보 게임을 합니다.
		 * 총 N번의 게임을 하여 A가 이기면 A를 출력하고,
		 * B가 이기면 B를 출력합니다.
		 * 비길 경우에는 D를 출력합니다.
		 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
		 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면
		 * 각 회를 누가 이겼는지 출력하는 프로그램 을 작성하세요.
		 */
		
		int[] inputArr1 = {2, 3, 3, 1, 3};
		int[] inputArr2 = {1, 1, 2, 2, 3};
		
		List<String> result = solution1(inputArr1, inputArr2);

		System.out.println(result);
	}
	
	static List<String> solution1(int[] arr1, int[] arr2){
		List<String> answer = new ArrayList<>();
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == arr2[i]) {
				answer.add("D");
			} else if(arr1[i] == 1 && arr2[i] == 2) {
				answer.add("B");
			} else if(arr1[i] == 2 && arr2[i] == 3) {
				answer.add("B");
			} else if(arr1[i] == 3 && arr2[i] == 1){
				answer.add("B");
			} else {
				answer.add("A");
			}
		}
		
		return answer;
	}

}
