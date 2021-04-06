package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveTheSmallestNumber {
	public static void main(String[] args) {
		int[] arr = {2,1,3,4};
		List<Integer> ar = new ArrayList(Arrays.asList(arr));
		for(int i = 0; i < arr.length; i++){
			ar.add(arr[i]);
		}
		if(arr.length < 2) {
			ar.clear();
			ar.add(-1);
		} else {
			int min = Arrays.stream(arr).min().orElse(-1);
			Iterator<Integer> it = ar.iterator();
			while(it.hasNext()) {
				if(it.next() == min) {
					it.remove();
				}
			}
			ar.remove(Arrays.stream(arr).min().orElse(-1));
		}
		ar.toArray();
	}
}