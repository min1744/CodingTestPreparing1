package level1;

import java.util.Arrays;

public class FindKim {
	public static String solution(String[] seoul) {
		return "�輭���� "+Arrays.asList(seoul).indexOf("Kim")+"�� �ִ�";
    }
	
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		String answer = solution(seoul);
		System.out.println(answer); 
	}
}