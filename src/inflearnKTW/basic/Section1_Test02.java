package inflearnKTW.basic;

public class Section1_Test02 {

	public static void main(String[] args) {
		/*
		 * 2. 삼각형 판별하기
		 * 길이가 서로 다른 A, B, C 세 개의 막대 길이가 주어지면
		 * 이 세 막대로 삼각형을 만들 수 있 으면 “YES"를 출력하고,
		 * 만들 수 없으면 ”NO"를 출력한다.
		 */
		
		int[] inputArr = {6,7,2};
		
		String result1 = solution1(inputArr); 
		String result2 = solution2(inputArr);
		String result3 = solution3(inputArr);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
	
	
	static String solution1(int[] arr) {
		String answer = "YES";
		
		int sum = arr[0]+arr[1]+arr[2];
		
		if(sum-arr[0]<=arr[0]) answer = "NO";
		if(sum-arr[1]<=arr[1]) answer = "NO";
		if(sum-arr[2]<=arr[2]) answer = "NO";
		
		return answer;
	}
	
	//틀린 문제 풀
	static String solution2(int[] arr) {
		String answer = "YES";
//		if(arr[0]+arr[1]<arr[2]
//			|| arr[0]+arr[2]<arr[1]
//			|| arr[1]+arr[2]<arr[0]) {
//			answer = "NO";
//		}
		
		if (arr[0]+arr[1]<arr[2]) answer = "NO";
		if (arr[0]+arr[2]<arr[1]) answer = "NO";
		if (arr[1]+arr[2]<arr[0]) answer = "NO";
		
		return answer;
	}
	
	// 답
	static String solution3(int[] arr) {
		String answer = "YES";
		int max;
		int sum = arr[0]+arr[1]+arr[2];
		
		if(arr[0]>arr[1]) max = arr[0];
		else max = arr[1];
		
		if(arr[2]>max) max = arr[2];
		if((sum-max)<=max) answer = "NO";
		
		return answer;
	}
	
}
