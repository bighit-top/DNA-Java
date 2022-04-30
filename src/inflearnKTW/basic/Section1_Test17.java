package inflearnKTW.basic;

import java.util.*;

public class Section1_Test17 {

	public static void main(String[] args) {
		/*
		 * 17. 중복단어제거
		 * N개의 문자열이 입력되면 중복된 문자열은 제거하고 출력하는 프로그램을 작성하세요.
		 * 출력하는 문자열은 원래의 입력순서를 유지합니다.
		 */
		
		String[] inputArr = {"good", "time", "good", "time", "student"};
		
		String[] result1 = solution1(inputArr);
		System.out.println(Arrays.toString(result1));
		
		List<String> result2 = solution2(inputArr);
		System.out.println(result2);
		
		ArrayList<String> result3 = solution3(inputArr);
		System.out.println(result3);
		
		LinkedHashSet<String> result4 = solution4(inputArr);
		System.out.println(result4);
		
		String[] result5 = solution5(inputArr);
		System.out.println(Arrays.toString(result5));
		
		String[] result6 = solution6(inputArr);
		System.out.println(Arrays.toString(result6));
		
	}
	
	// 나의 답
	static String[] solution1(String[] strArr) {
		String[] answer;
		List<String> list = new ArrayList<>();
		for(int i=0; i<strArr.length; i++) {
			int cnt = 0;
			for(int j=0; j<=i; j++) {
				if(strArr[i].equals(strArr[j])) cnt++; 
			}
			if(cnt==1) list.add(strArr[i]);
		}
		answer = list.toArray(new String[0]); //new String[list.size()]
		return answer;
	}
	
	static List<String> solution2(String[] strArr) {
		List<String> answer = new ArrayList<>();
		for(int i=0; i<strArr.length; i++) {
			if(Arrays.asList(strArr).indexOf(strArr[i])==i) answer.add(strArr[i]);
		}
		return answer;
	}
	
	static ArrayList<String> solution3(String[] strArr){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : strArr){
		    if(!answer.contains(x)) answer.add(x);
		}
		return answer;
	}
	
	// set은 중복을 허용하지 않는다.
	static LinkedHashSet<String> solution4(String[] strArr){
		LinkedHashSet<String> answer = new LinkedHashSet<>();
		for(String x : strArr) answer.add(x);
		return answer;
	}
	
	static String[] solution5(String[] strArr) {
		strArr = new LinkedHashSet<String>
		(Arrays.asList(strArr)).toArray(new String[0]);
		return strArr;
	}
	
	// 배열 => strem => 중복제거 => 배열
	static String[] solution6(String[] strArr) {
		String[] answer = Arrays.stream(strArr).distinct().toArray(String[]::new);
		return answer;
	}

}
