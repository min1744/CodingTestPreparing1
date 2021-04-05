package level1;

public class StrangeCharacter {
	public static void main(String[] args) {
		String s = "ab hello world";
        StringBuffer sb = new StringBuffer();
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
        	cnt = ss.contains(" ")? 0 : cnt + 1;
            //cnt = " ".equals(ss)? 0 : cnt + 1;
        	//System.out.println(cnt);
            sb.append(cnt % 2 == 0? ss.toLowerCase() : ss.toUpperCase()); 
        }
        System.out.println(sb.toString());
        System.out.println(Math.abs(-1) % 2 == 1? "Odd" : "Even");
	}
}