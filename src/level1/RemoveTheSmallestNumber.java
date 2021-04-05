package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveTheSmallestNumber {
	public static void main(String[] args) {
		int[] arr = {2,1,3,4};
		List<Integer> ar = new ArrayList(Arrays.asList(arr));
		if(arr.length == 1) {
			ar.clear();
			ar.add(-1);
		} else {
			Collections.sort(ar, Collections.reverseOrder());
			
		}
		ar.toArray();
	}
}