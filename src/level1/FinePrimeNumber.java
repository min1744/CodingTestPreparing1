package level1;

public class FinePrimeNumber {
	public static void main(String[] args) {
		int n = 5;
		int answer = 0;
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
            	answer++;
            }
        }
        System.out.println(answer);
        //return answer;
	}
	
	public static boolean isPrime(int num) {
		for(int l = 2; l <= Math.sqrt(num); l++) {
			if(num % l == 0) return false;
		}
		return true;
	}
}