import java.util.*;
class Solution {
    public int solution(int[] order) {
        
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        
        for (int i=1; i<order.length+1; i++) {
            q.add(i);
        }
        
        int answer =0;
        int i=0;
        
        while (true) {
            boolean flag = false;
            
            if (!q.isEmpty() && q.peek()==order[i]) {
                answer++;
                i++;
                q.poll();
                flag=true;
                continue;
            }
            
            if (!st.isEmpty() && st.peek()==order[i]) {
                answer++;
                i++;
                st.pop();
                flag=true;
                continue;
            }
            
            
            if (!q.isEmpty()) {
                st.push(q.poll());
                flag=true;
            }
            if(!flag) break;
        }

        return answer;
    }
}