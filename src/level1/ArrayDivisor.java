package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDivisor {
	public static int[] solution(int[] arr, int divisor) {
		Arrays.sort(arr);
		//return Arrays.stream(arr).filter(element->element%divisor==0).toArray();
		boolean chkmatch = Arrays.stream(arr).anyMatch(element->element%divisor==0);
		return chkmatch?Arrays.stream(arr).filter(element->element%divisor==0).toArray():new int[]{-1};
		/*
        List<Integer> li = new ArrayList<Integer>();
        for(int element:arr) {
        	if(element % divisor == 0) {
        		li.add(element);
        	}
        }
        if(li.size() == 0) li.add(-1);
        Collections.sort(li);
        return li.stream().mapToInt(i->i).toArray();
        */
    }
	
	public static void main(String[] args) {
		int[] arr = {2, 36, 1, 3};
		int divisor = 1;
		int[] answer = solution(arr, divisor);
		for(int a:answer) {
			System.out.println(a);
		}
	}
}