package level1;

public class Sqrt {
	public static void main(String[] args) {
		long n = 121;
		System.out.println(Math.sqrt(n)%1==0?(long)Math.pow(Math.sqrt(n)+1, 2):-1);
	}
}