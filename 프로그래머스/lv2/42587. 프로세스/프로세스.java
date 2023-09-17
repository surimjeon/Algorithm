import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        //우선순위가 주어지고, location 인덱스는 몇번째로 반환되는지
        // 우선순위로 정렬될텐데 
        Queue<int[]> pq = new LinkedList<>();
        
        for (int i=0; i<priorities.length; i++) {
            pq.add(new int[] {priorities[i], i});
        }
        
        while(!pq.isEmpty()) {
            int[] temp = pq.poll();
            int num = temp[0];
            int idx = temp[1];
            
            boolean istrue= false;
            for (int[] p: pq) {
                if (num<p[0]) {
                    istrue=true;
                    break;
                }
            }
            
            if(istrue) {
                pq.add(temp);
                continue;
            }
            answer++;
            if (idx==location) {
                break;
            }
            
        }
        
        return answer;
    }
}