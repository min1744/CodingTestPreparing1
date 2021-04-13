package level1;

public class MiddleNumber {
	public static void main(String[] args) {
		String s = "abcde";
		int len = s.length();
		System.out.println(s.substring(len%2==1?len/2:len/2-1, len/2+1));
	}
}