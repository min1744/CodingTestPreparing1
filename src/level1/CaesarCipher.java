package level1;

public class CaesarCipher {
	public static void main(String[] args) {
        String s = "a B z";
        int n = 2;
        n = n % 26;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
          char ch = s.charAt(i);
          if (Character.isLowerCase(ch)) {
            ch = (char) ((ch - 'a' + n) % 26 + 'a');
          } else if (Character.isUpperCase(ch)) {
            ch = (char) ((ch - 'A' + n) % 26 + 'A');
          }
          sb.append(ch);
        }
        /*
        n = n % 26;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++) {
        	int asciicode = (int)s.charAt(i);
        	if(Character.isAlphabetic(asciicode)) {
        		asciicode = asciicode + n;
        	}
        	if(Character.isUpperCase(s.charAt(i))) {
        		if(asciicode > 90) {
        			asciicode -= 26;
        		}
        	} else if(Character.isLowerCase(s.charAt(i))) {
        		if(asciicode > 122) {
        			asciicode -= 26;
        		}
        	}
        	sb.append((char)asciicode);
        }
        System.out.println(sb.toString());
        */
	}
}