package level1;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateNumbers {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		/*
		List<Integer> ar = new ArrayList();
		ar.add(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i-1] != arr[i]) {
				ar.add(arr[i]);
			}
		}
		for(int num:ar) {
			System.out.println(num);
		}
		*/
	    List<Integer> tempList = new ArrayList<Integer>();
	    int preNum = 10;
	    for(int num : arr) {
	        if(preNum != num)
	            tempList.add(num);
	        preNum = num;
	    }       
	    int[] answer = new int[tempList.size()];
	    for(int i=0; i<answer.length; i++) {
	        answer[i] = tempList.get(i).intValue();
	    }
	}
}