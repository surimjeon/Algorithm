import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        //우선순위큐를 써서 힙 구현하기
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i=0; i<scoville.length; i++) {
            q.add(scoville[i]);
        }
        
        int cnt =0;
        while (q.peek() <K) {
            if (q.size()==1) {
                cnt=-1;
                break;
            }
            int first = q.poll();
            int second = q.poll();
            int now = first + (second*2);
            cnt++;
            q.add(now);
        }
        return cnt;
    }
}