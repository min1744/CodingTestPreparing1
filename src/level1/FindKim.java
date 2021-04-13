package level1;

import java.util.Arrays;

public class FindKim {
	public static String solution(String[] seoul) {
		return "김서방은 "+Arrays.asList(seoul).indexOf("Kim")+"에 있다";
    }
	
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		String answer = solution(seoul);
		System.out.println(answer); 
	}
}