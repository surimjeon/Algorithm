import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // k이상으로 스코빌지수를 만들기() ->모든음식의 스코빌이 k이상 될때까지 몇번?
        //못만들면 -1
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i=0; i<scoville.length; i++) {
            pq.add(scoville[i]);
        }
        
        // -1경우, 2개이하일경우
        while (!pq.isEmpty()) {
            int first = pq.poll();
            if (pq.size()==0 && first<K) {
                answer=-1;
                break;
            }
            if (first>=K) break;
            int second = pq.poll();
            int plus = first + second*2;
            pq.add(plus);
            answer++;
        }
        
        
        return answer;
    }
}