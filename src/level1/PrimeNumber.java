package level1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class PrimeNumber {
	public static void main(String[] args) {
		//int a = (int) Math.sqrt(a);
		//Á¦°ö±Ù(return : double)
		int answer = 0;
		int[] nums = {1, 2, 3, 4};
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				for(int k = j+1; k < nums.length; k++) {
					if(isPrime(nums[i] + nums[j] + nums[k])) {
						answer += 1;
					}
				}
			}
		}
		//return answer;
		System.out.println("answer : "+answer);
	}
	
	
	public static boolean isPrime(int num) {
		for(int l = 2; l <= Math.sqrt(num); l++) {
			if(num % l == 0) return false;
		}
		return true;
	}
	/*
	public static boolean isPrime(int num){
        int cnt = 0;
        for(int i = 1; i <= (int)Math.sqrt(num); i ++){
            if(num % i == 0) cnt += 1; 
        }
        return cnt == 1;
    }
    */
	
	public static void test() {
		ArrayList<String> list = new ArrayList<>();
		Iterator<String> a = list.iterator();
		boolean chk = a.hasNext();
		Collections.reverse(list);
	}
}