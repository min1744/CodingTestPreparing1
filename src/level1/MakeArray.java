package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MakeArray {
	public int[] solution(long n) {
	      String a = "" + n;
	        int[] answer = new int[a.length()];
	        int cnt=0;

	        while(n>0) {
	            answer[cnt]=(int)(n%10);
	            n/=10;
	            System.out.println(n);
	            cnt++;
	        }
	      return answer;
	  }
	
	public static void main(String[] args) {
		long n = 12345;
		
		//1.
		//new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
		
		String[] arr = Long.toString(n).split("");
		int[] answer = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			answer[i] = Integer.parseInt(arr[arr.length-i-1]);
		}
	}
}