package level1;

public class CollatzConjecture {
	public static void main(String[] args) {
		long num = 6;
		int sum = 0;
		while(num > 1 || sum == 500) {
			num = num % 2 == 0? num /= 2 : num * 3 + 1;
			sum++;
		}
		System.out.println(sum<500?sum:-1);
	}
}