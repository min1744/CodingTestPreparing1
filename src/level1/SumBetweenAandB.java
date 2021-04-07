package level1;

public class SumBetweenAandB {
	public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
	/*
	public static void main(String[] args) {
		int i = 3;
		int j = 5;
		
		long a = (long)i;
		long b = (long)j;
		long tmp = 0;
		if(b < a) {
			tmp = a;
			a = b;
			b = tmp;
			tmp = 0;
		}
		if((a <= 1 && b >= 1) || (b-a)%2 == 1){
			tmp = (a+b)*((b-a+1)/2);
			System.out.println("a");
		} else {
			tmp = (a+b)*((b-a)/2);
			System.out.println("b");
		}
		if((b-a)%2 == 0) {
			tmp += (a+b)/2;
			System.out.println("c");
		}
		System.out.println(tmp);
		//return tmp;
		
		long res = 0;
		for(long k = a; k <= b; k++) {
			res+= k;
		}
		System.out.println("Á¤´ä : "+res);
	}
*/
}