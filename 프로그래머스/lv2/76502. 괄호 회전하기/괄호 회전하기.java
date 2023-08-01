import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i=0; i<s.length(); i++) { //0부터 s길이까지 회전회수
            Stack<Character> st = new Stack<>(); 
            String mes = s.substring(i, s.length()) +s.substring(0,i);
            for (int j=0; j<s.length(); j++) {
                char temp = mes.charAt(j);
                if (st.isEmpty()) {
                    st.push(temp);
                }
                else if (temp==']'&& st.peek()=='[') {
                    st.pop();
                }
                else if (temp==')'&& st.peek()=='(') {
                    st.pop();
                }
                else if (temp=='}'&& st.peek()=='{') {
                    st.pop();
                }
                else {
                    st.push(temp); 
                }
            }
            if (st.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}