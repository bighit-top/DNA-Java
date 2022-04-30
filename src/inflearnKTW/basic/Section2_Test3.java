package inflearnKTW.basic;

import java.util.ArrayList;

public class Section2_Test3 {

	public static void main(String[] args) {
		/*
		 * 3. 가위 바위 보
		 * A, B 두 사람이 가위바위보 게임을 합니다.
		 * 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다.
		 * 비길 경우에는 D를 출력합니다.
		 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
		 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 
		 * 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
		 */
		
		int[] inputArr1 = {2, 3, 3, 1, 3};
		int[] inputArr2 = {1, 1, 2, 2, 3};
		
		ArrayList<String> result1 = solution1(inputArr1, inputArr2);
		System.out.println(result1);
		
	}

	static ArrayList<String> solution1(int[] a, int[] b) {
		
		ArrayList<String> answer = new ArrayList<String>();
		
		for(int i=0; i<a.length; i++) {
			if(a[i]-b[i] == 1 || a[i]-b[i] == -2) answer.add("A");
			else if (a[i]==b[i]) answer.add("D");
			else answer.add("B");
		}
		
		return answer;
		
	}

}
