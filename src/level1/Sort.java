package level1;

import java.util.Arrays;

public class Sort {
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
	/*
	public static int[] solution(int[] array, int[][] commands) {
		int[] res = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
        	int[] answer = new int[commands[i][1] - commands[i][0] + 1];
        	int cnt = 0;
        	for(int j = commands[i][0]-1; j <= commands[i][1]-1; j++) {
        		answer[cnt] = array[j];
        		cnt++;
        	}
        	Arrays.sort(answer);
        	res[i] = answer[commands[i][2]-1];
        	System.out.println(res[i]);
        }
        
        return res;
	}
	*/
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}; 
		int[] answer = solution(array, commands);
		for(int a:answer) {
			//System.out.println(a);
		}
	}
}