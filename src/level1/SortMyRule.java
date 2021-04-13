package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMyRule {
	public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> arr = new ArrayList<>();
        //Arrays.asList(strings);
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
            System.out.println("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		String[] answer = solution(strings, n);
		for(String el:answer) {
			//System.out.println(el);
		}
	}
}