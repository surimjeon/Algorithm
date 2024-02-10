//10분간 청소 후 다른 사람 -> 필요한 최소 객실의 수
import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        // 시작시간 순으로 정렬하기
        int[][] time = new int[book_time.length][2];
        boolean[] visited = new boolean[book_time.length];
        for (int i=0; i<book_time.length; i++) {
            time[i][0] = change(book_time[i][0]);
            time[i][1] = change(book_time[i][1]);
        }
        Arrays.sort(time, (o1,o2) -> o1[0]-o2[0]);
        // 다음 회의시작 시간이 직전종료시각보다 작으면, count?
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int[] t : time) {
            if(pq.size()==0){
                pq.add(t[1]+10);
                continue;
            }
            int peek = pq.peek();
            if (t[0]>=peek) {
                pq.poll();
            }
            pq.add(t[1]+10);
        }
        
        return pq.size();
    }
    public int change(String t) {
        String[] s = t.split(":");
        return Integer.parseInt(s[0])*60 + Integer.parseInt(s[1]);
    }
}