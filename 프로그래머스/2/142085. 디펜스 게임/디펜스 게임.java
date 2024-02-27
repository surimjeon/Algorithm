// 병사(n) - 적의 수 -> 적이 더 많으면, 게임 종료
// 무적권 k번(한 라운드)
import java.util.*;
class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;
        if (enemy.length <= k) return answer;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum =0;
        for (int i=0; i<enemy.length; i++) {
            pq.add(enemy[i]);
            sum+=enemy[i];
            if (sum>n) {
                if (k>0 && !pq.isEmpty()) { //pq에 꺼낼값이 있을 떄
                    sum-=pq.poll();
                    k--;
                }
                else {
                    answer= i;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}