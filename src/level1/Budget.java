package level1;

import java.util.Arrays;

public class Budget {
	public static void main(String[] args) {
		int[] d = {2,2,3,3};
		int budget = 10;
		int answer = 0;
		
		Arrays.sort(d);
		//Collections.sort(d); //List
		for(int i = 0; i < d.length; i++) {
			if(budget >= d[i]) {
				budget -= d[i];
				answer++;
			} else {
				break;
			}
		}
		System.out.print(answer);
	}
}