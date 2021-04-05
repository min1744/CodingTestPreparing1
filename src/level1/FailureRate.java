package level1;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
public class FailureRate {
	public static void main(String[] args) {
		int N = 4;
		int[] stages = {4,4,4,4,4};
		
		double denominator = 0;//분모
		double numerator = 0;//분자
		Map<Integer, Double> map = new HashMap<>();
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < stages.length; j++) {
				if(stages[j] >= i) {
					denominator++;
				}
				if(stages[j] == i) {
					numerator++;
				}
			}
			if(denominator == 0) denominator = 1;
			map.put(i, numerator/denominator);
			denominator = 0;
			numerator = 0;
		}
		List<Integer> keySetList = new ArrayList<>(map.keySet());
		Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		int[] answer = new int[N];
		int size = 0;
		for(Integer key : keySetList) {
			answer[size++] = key;
			//System.out.println("Stage : " + key + " / " + "Failure Rate : " + map.get(key));
		}
	}
}
*/
//https://gmlwjd9405.github.io/2018/09/06/java-comparable-and-comparator.html
public class FailureRate {
    public int[] solution() {//int N, int[] lastStages) {
		int N = 4;
		int[] lastStages = {4,4,4,4,4};
		
        int nPlayers = lastStages.length;
        int[] nStagePlayers = new int[N + 2];
        for (int stage : lastStages) {
            nStagePlayers[stage] += 1;
        }
        
        int remainingPlayers = nPlayers;
        List<Stage> stages = new ArrayList<>();
        for (int id = 1 ; id <= N; id++) {
            double failure = (double) nStagePlayers[id] / remainingPlayers;
            remainingPlayers -= nStagePlayers[id];

            Stage s = new Stage(id, failure);
            stages.add(s);
        }
        Collections.sort(stages, Collections.reverseOrder());

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stages.get(i).id;
        }
        return answer;
    }

    class Stage implements Comparable<Stage> {
        public int id;
        public double failure;

        public Stage(int id_, double failure_) {
            id = id_;
            failure = failure_;
        }
        
        @Override
        public int compareTo(Stage o) {
            if (failure < o.failure ) {
                return -1;
            }
            if (failure > o.failure ) {
                return 1;
            }
            return 0;
        }
        
    }
}