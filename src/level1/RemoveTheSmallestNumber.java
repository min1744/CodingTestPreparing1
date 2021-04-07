package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveTheSmallestNumber {
	 public int[] solution(int[] arr) {
	      if (arr.length <= 1) return new int[]{1};
	      int min = Arrays.stream(arr).min().getAsInt();
	      return Arrays.stream(arr).filter(i -> i != min).toArray();
	  }
	
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		List<Integer> ar = new ArrayList();
		if(arr.length < 2) {
			ar.add(-1);
		} else {
			for(int i = 0; i < arr.length; i++){
				ar.add(arr[i]);
			}
			int min = Arrays.stream(arr).min().orElse(-1);
			for(int i = 0; i < ar.size(); i++) {
				if(ar.get(i) == min) {
					ar.remove(i);
				}
			}
		}
		ar.toArray();
		for(int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
}