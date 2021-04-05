package level1;

public class Watermelon {
	public static void main(String[] args) {
		int n = 4;
		StringBuffer sb = new StringBuffer();
        for(int i = n; i > 0; i--){
            if(i%2 == 1){
                sb.append("¹Ú");
            } else {
                sb.append("¼ö");
            }
        }
        System.out.println(sb.toString());
	}
}