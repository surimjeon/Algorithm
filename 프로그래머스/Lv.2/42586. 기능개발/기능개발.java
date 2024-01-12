// 100%여야 배포가능, 순서는 이대로 배포해야함(이전꺼가 다되어야 가능) =>동시에 몇개까지 가능?
// 7 3 9 이대로 큐에 쌓이고, 7먼저 빼낼때, 뒤에 나보다 같거나 작은거 몇개? 
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> q = new LinkedList<>();
        
        for (int i=0; i<progresses.length; i++) {
            int day = (100-progresses[i])/speeds[i];
            if ((100-progresses[i])%speeds[i]!=0) {
                day+=1;
            }
            q.add(day);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int first = q.poll();
        int cnt =1;
        while (!q.isEmpty()) {
            int second = q.poll();
            if (first >= second) cnt++;
            else {
                arr.add(cnt);
                cnt=1;
                first = second;
            }
        }
        arr.add(cnt);
        
        return arr.stream()
            .mapToInt(i->i)
            .toArray();
    }
}