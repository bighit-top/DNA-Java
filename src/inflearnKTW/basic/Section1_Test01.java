package inflearnKTW.basic;

public class Section1_Test01 {

	public static void main(String[] args) {
		/*
		 * 1. 세 수 중 최솟값
		 * 100이하의 자연수 A, B, C를 입력받아 세 수 중 가장 작은 값을 출력하는 프로그램을 작성하세요.(정렬을 사용하면 안됩니다)
		 */
		
		
		int[] inputArr = {6,5,11};
		
		int result1 = solution1(inputArr);
		int result2 = solution2(inputArr);
		
		System.out.println(result1);
		System.out.println(result2);
		
	}
	
	
	static int solution1(int[] arr) {		
		int answer = arr[0];
		
		if(answer > arr[1]) answer = arr[1];
		if(answer > arr[2]) answer = arr[2];
		
		return answer;
	}
	
	// 답
	static int solution2(int[] arr) {		
		int answer;
		
		if(arr[0]>arr[1]) answer = arr[1];
		else answer = arr[0];
		if(answer>arr[2]) answer = arr[2];
		
		return answer;
	}
	
	

}
