package level1;

import java.util.Map;
import java.util.HashMap;

public class Marathon {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        //key : 이름 / value : 인원수
        //++
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        //--
        for (String player : completion) hm.put(player, hm.get(player) - 1);
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
                break;
            }
        }
        return answer;
		/*
		Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
        */
    }
	
	//value값으로 key값 찾기
	private static Object getKey(Map<Integer, String> map, String value) {
		for(Object o: map.keySet()) {
			if(map.get(o).equals(value)) {
				return o;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		String s = solution(participant, completion);
		System.out.println(s); 
	}
}