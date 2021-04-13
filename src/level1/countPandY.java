package level1;

public class countPandY {
	public static boolean solution(String s) {
		s = s.toUpperCase();
        return s.chars().filter(e -> 'P'== e).count() == s.chars().filter(e -> 'Y'== e).count();
        /*
        boolean answer = true;
        int cntP = 0;
        int cntY = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(s.toUpperCase().charAt(i) == 'P') {
        		cntP++;
        	}
        	if(s.toUpperCase().charAt(i) == 'Y') {
        		cntY++;
        	}
        }
        if(cntP != cntY) {
        	answer = false;
        }
        
        return answer;
        */
    }
	
	public static void main(String[] args) {
		String s = "pPoooyY";
		System.out.println(solution(s));
	}
}