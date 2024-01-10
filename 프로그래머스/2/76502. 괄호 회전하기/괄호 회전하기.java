//쌍이 맞아야함. 그리고, 다 맞던가, 아님, 
// quque에 넣고, 하나씩 빼서 뒤로 넣어보기 + stack
import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Queue<Character> q = new LinkedList<>();
        
        for (int i=0; i<s.length(); i++) {
            q.add(s.charAt(i));
        }
        
        for (int x=0; x<s.length(); x++) {
            char qf = q.poll();
            q.add(qf);
            
            Stack<Character> st = new Stack<>();
            
            for (int i=0; i<s.length(); i++) {
                char first = q.poll();
                q.add(first);
                //짝 맞춰주기
                if (st.isEmpty()) st.push(first);
                else if (first==')' && st.peek()=='(') st.pop();
                else if (first==']' && st.peek()=='[') st.pop();
                else if (first=='}' && st.peek()=='{') st.pop();                               else st.push(first);
            }
            if (st.isEmpty()) answer++; 
        }
        
        
        return answer;
    }
}