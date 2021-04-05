package level1;

public class SumDivisor {
	public static void main(String[] args) {
		int n = 12;
		int sum = 0;
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0) {
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println("-----------");
		System.out.println(n+sum);
	}
}