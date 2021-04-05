package level1;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
	public static void main(String[] args) {
		long n = 18357189L;
		char[] arr = Long.toString(n).toCharArray();
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder(new String(arr));
		System.out.println(Long.parseLong(sb.reverse().toString()));
		/*
		String[] array = Long.toString(n).split("");
		Arrays.sort(array, Collections.reverseOrder());
		StringBuffer sb = new StringBuffer(array.length);
		for(int i = 0; i < array.length; i++) {
			sb.append(array[i]);
		}
		System.out.println(Long.parseLong(sb.toString()));
		*/
	}
}