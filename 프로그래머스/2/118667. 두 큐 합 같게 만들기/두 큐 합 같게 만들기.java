// 두개의 큐를 동일하게 만들기 -> 작업횟수를 최소로 만들어서 합같게 만들기
import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        //2개의 합 차이를 print하고, 14 / 16
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long sum1 = 0;
        long sum2 = 0;
        for (int i=0; i<queue1.length; i++) {
            sum1+=(queue1[i]);
            sum2+=(queue2[i]);
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        long sum = (sum1+sum2)/2;
        
        while (sum1!=sum2) {
            // 큐 원소합을 같게 만들 수 없는 경우 = 모든 큐를 다 돌았는데도 안된다 = -1
            if (answer>(q1.size()+q2.size())*2) {
                answer = -1;
                break;
            }
            if (sum1<sum2) {
                int two = q2.poll();
                q1.add(two);
                sum1+=(long)two;
                sum2-=(long)two;
                answer++;
            }
            else if (sum1>sum2) {
                int one = q1.poll();
                q2.add(one);
                sum1-=(long)one;
                sum2+=(long)one;
                answer++;
            }
            else {
                break;
            }
            
        }
        
        
        
        
        return answer;
    }
}