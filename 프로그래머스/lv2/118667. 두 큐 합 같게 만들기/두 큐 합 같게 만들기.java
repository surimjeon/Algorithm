import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        // 두개의 합/2한 것보다 더 작으면, 다른 큐에서 뺴오기
        //long타입으로 변환
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long total=0;
        long q1_hap = 0;
        
        for (int i=0; i<queue1.length; i++) { //두 큐의길이는 같음
            total+=queue1[i];
            q1_hap+=queue1[i];
            q1.add(queue1[i]);
            total+=queue2[i];
            q2.add(queue2[i]);
        }
        
        total/=2;
        
        while (total!=q1_hap) {
            if (answer>queue1.length*4) {
                return -1;
            }
            if(total>q1_hap) {
                int temp = q2.poll();
                q1_hap+=temp;
                q1.add(temp);
            }
            else if (total<q1_hap) {
                int temp = q1.poll();
                q1_hap-=temp;
                q2.add(temp);
            }
            answer++;
        }
        
        
        return answer;
    }
}