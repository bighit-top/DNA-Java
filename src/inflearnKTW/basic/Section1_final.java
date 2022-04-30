package inflearnKTW.basic;

import java.util.Arrays;

public class Section1_final {

	public static void main(String[] args) {
		
		// 1. 세 수 중 최솟값
		int[] arr1 = {6, 5, 11};
		int result1 = 0;
		
		if(arr1[0] > arr1[1]) result1 = arr1[1];
		else result1 = arr1[0];
		if(result1 > arr1[2]) result1 = arr1[2];
		
		System.out.println("1. 세 수 중 최솟값 : \t" + result1);
		
		
		// 2. 삼각형 판별하기
		int[] arr2 = {6, 7, 11};
		String result2 = "YES";
		
//		int sum2 = Arrays.stream(arr2).sum();
//		int max2 = Arrays.stream(arr2).max().getAsInt();
//		if(sum2-max2 <= max2) result2 = "NO";
		
		int sum2 = arr2[0]+arr2[1]+arr2[2];
		int max2;
		
		if(arr2[0] > arr2[1]) max2 = arr2[0];
		else max2 = arr2[1];
		if(max2 < arr2[2]) max2 = arr2[2];
		if(sum2-max2 <= max2) result2 = "NO";
		
		System.out.println("2. 삼각형 판별하기 : \t" + result2);
		
		
		// 3. 연필 개수
		int input3 = 178;
		int result3 = (int)Math.ceil((double)input3/12);
		
		System.out.println("3. 연필 개수 : \t" + result3);
		
		
		// 4. 1부터 N까지 합 출력하기
		int input4 = 6;
		int result4 = 0;
		
		for(int i=0; i<input4; i++) result4 += i;
		
		System.out.println("4. 1부터 N까지 합 출력하기 : \t" + result4);
		
		
		// 5. 최솟값 구하기
		int[] arr5 = {5, 3, 7, 11, 2, 15, 17};
		int result5 = Integer.MAX_VALUE;
		
//		result5 = Arrays.stream(arr5).min().getAsInt();
		
		for(int x : arr5) {
			if(result5 > x) result5 = x;
		}
		
		System.out.println("5. 최솟값 구하기 : \t" + result5);
		
		
		// 6. 홀수
		int[] arr6 = {12, 77, 38, 41, 53, 92, 85};
		int[] result6 = new int[2];
		int min6 = Integer.MAX_VALUE;
		
		for(int x : arr6) {
			if(x%2 != 0) {
				if(min6 > x) min6 = x;
				result6[0] += x;
				result6[1] = min6;
			}
		}
		
		System.out.println("6. 홀수 : \t" + Arrays.toString(result6));
		
		
		// 7. 10부제
		int input7 = 3;
		int[] arr7 = {25, 23, 11, 27, 53, 17, 33};
		int result7 = 0;
		
		for(int x : arr7) {
			if(x%10 == input7) result7++;
		}
		
		System.out.println("7. 10부제 : \t" + result7);
		
		
		// 8. 일곱 난쟁이
		int[] arr8 = {20, 7, 23, 19, 10, 15, 25, 8, 13};
		int[] result8 = new int[arr8.length-2];
		int index1, index2;
		index1=index2=arr8.length-1;
		int sum8 = Arrays.stream(arr8).sum();
		
		for(int i=0; i<arr8.length-1; i++) {
			for(int j=1; j<arr8.length; j++) {
				if(sum8-(arr8[i]+arr8[j]) == 100) {
					index1 = i;
					index2 = j;
					break;
				}
			}
		}
		
		System.arraycopy(arr8, index2+1, arr8, index2, arr8.length-index2-1);	
		System.arraycopy(arr8, index1+1, arr8, index1, arr8.length-index1-1);
		
//		System.out.println(Arrays.toString(Arrays.copyOf(arr8, arr8.length-2)));

		System.arraycopy(arr8, 0, result8, 0, arr8.length-2);
		System.out.println("8. 일곱 난쟁이 : \t" + Arrays.toString(result8));
		
		
		// 9. A를 #으로
		String str9 = "BANANA";
//		String result9 = str9.replaceAll("[A]", "#");
		
		String result9 = "";
		char[] arr9 = str9.toCharArray();
		
		for(int i=0; i<arr9.length; i++) {
			if(String.valueOf(arr9[i]).equals("A")) {
				arr9[i] = '#';
			}
		}
		result9 = String.valueOf(arr9);
		
		System.out.println("9. A를 #으로 : \t" + result9);
		
		
		//10. 문자 찾기
		String str10 = "COMPUTERPROGRAMMING";
		int result10 = 0;
		char[] arr10 = str10.toCharArray();
		
		for(char chr : arr10) {
			if(String.valueOf(chr).equals("R")) result10++;
		}
		
		System.out.println("10. 문자 찾기 : \t" + result10);
		
		
		//11. 대문자 찾기
		String str11 = "KoreaTimeGood";
		int result11 = 0;
		char[] arr11 = str11.toCharArray();
		
		for(char chr : arr11) {
			String tmpChr = String.valueOf(chr);
			if(tmpChr.equals(tmpChr.toUpperCase())) result11++;
		}
		
		System.out.println("11. 대문자 찾기 : \t" + result11);
		
		
		//12. 대문자로 통일
		String str12 = "ItisTimeToStudy";
		String result12 = str12.toUpperCase();
		
		System.out.println("12. 대문자로 통일 : \t" + result12);
		
	}

}
