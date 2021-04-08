package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthNumber {
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        for(int i = 0; i < commands.length; i++) {
        	int[] tmp = new int[commands[i][1] - commands[i][0] + 1];
        	int cnt = 0;
        	for(int j = commands[i][0]; j <= commands[i][1]; j++) {
        		tmp[cnt] = j;
        		cnt++;
        	}
        	Arrays.sort(tmp);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int answer[] = solution(array, commands);
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}