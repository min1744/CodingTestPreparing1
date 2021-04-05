package level1;

public class SecretMap {
	public static void main(String[] args) {
		int n = 2;
		int[] arr1 = {1,2};
		int[] arr2 = {1,1};
		String[] res = solution(n, arr1, arr2);
		System.out.print("[");
		for(int i = 0; i < n; i++) {
			System.out.print("\"");
			System.out.print(res[i]);
			System.out.print("\"");
			if(i < n-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		
		
		//System.out.println(String.format("%10s", "a"));
		//         a
	}

/*
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
        	StringBuffer sb = new StringBuffer();
        	String expression = "%0"+n+"d";
        	//String arr_1 = String.format(expression, Integer.parseInt(Integer.toBinaryString(arr1[i]).toString()));
        	//String arr_2 = String.format(expression, Integer.parseInt(Integer.toBinaryString(arr2[i]).toString()));
        	String arr_1 = String.format(expression, Long.parseLong(Integer.toBinaryString(arr1[i]).toString()));
        	String arr_2 = String.format(expression, Long.parseLong(Integer.toBinaryString(arr2[i]).toString()));
        	for(int j = 0; j < n; j++) {
        		if(arr_1.charAt(j) == '1' || arr_2.charAt(j) == '1') {
        			sb.append("#");
        		} else if(arr_1.charAt(j) == '0' && arr_2.charAt(j) == '0') {
        			sb.append(" ");
        		}
        	}
        	answer[i] = sb.toString();
        }
        return answer;
    }
*/

	  public static String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] result = new String[n];
	        for (int i = 0; i < n; i++) {
	            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
	        }
	        //비트 논리 연산자
	        //a & b : AND 연산
	        //a | b : OR  연산
	        //a ^ b : XOR 연산

	        for (int i = 0; i < n; i++) {
	            result[i] = String.format("%" + n + "s", result[i]);
	            result[i] = result[i].replaceAll("1", "#");
	            result[i] = result[i].replaceAll("0", " ");
	        }

	        return result;
	    }
}