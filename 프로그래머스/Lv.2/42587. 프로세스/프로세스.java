// 우선순위 큐->
import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        //우선순위 큐에 담긴 숫자를 꺼내는데, 일치할때 poll하면 그 우선순위에 맞게 빠져나오게 됨
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num : priorities) {
            pq.add(num);
        }
        
        while (!pq.isEmpty()) {
            for (int i=0; i<priorities.length; i++) {
                if (priorities[i]==pq.peek()) {
                    pq.poll();
                    answer++;
                    if (i==location) return answer;
                }
            }
        }
        return answer;
    }
}