package level1;

import java.util.Map;
import java.util.HashMap;

public class Greedy {
	public static int solution(int n, int[] lost, int[] reserve) {
		int[] people = new int[n];
        int answer = n;
        for (int l : lost) 
            people[l-1]--;
        for (int r : reserve) 
            people[r-1]++;
        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else 
                    answer--;
            }
        }
        return answer;
		/*
		//key : �л��� ��ȣ / value : ü���� ����
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int answer = 0;
		//�� �������
		for(int i = 1; i <= n; i++) hm.put(i, 1);
		//����� �Ҿ����
		for(int i:lost) hm.remove(i);
		//���� �ִ»��~
		for(int i:reserve) hm.put(i, hm.getOrDefault(i, 0)+1);
		for(int i = 1; i <= n; i++) {
			//�� �ֽ��ϴ�~
			if(hm.getOrDefault(i, 0) > 0) {
				answer++;
				hm.put(i, hm.get(i)-1);
			//���� ==> �ջ�� ���� ����?
			} else if(hm.getOrDefault(i-1, 0) == 1) {
				answer++;
				hm.put(i-1, hm.get(i-1)-1);
			//���� ==> �޻�� ���� ����?
			} else if(hm.getOrDefault(i+1, 0) == 2) {
				answer++;
				hm.put(i+1, hm.get(i+1)-1);
			}
		}
		return answer;
		*/
    }
	
	public static void main(String[] args) {
		int n = 1;
		int[] lost = {1};
		int[] reserve = {1};
		System.out.println(solution(n, lost, reserve));
	}
}