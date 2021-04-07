package level1;

public class StringBasic {
	public static void main(String[] args) {
		String s = "1234";
		
		//1.
		//return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0)? false : true;
		
		//2.
		//return (s.length() != 4 && s.length() != 6) || (s.matches("(^[0-9]*$)"))? false : true;
		
		int len = s.length();
		if(!(len == 4 || len == 6)) {
			//return false;
			System.out.println("4 or 6 X");
		}
		char[] a = s.toCharArray();
		for(int i = 0; i < a.length; i++) {
			if(!Character.isDigit(a[i])) {
				//return false;
				System.out.println("isNotDigit");
			}
		}
		//return true;
		System.out.println(true);
	}
}