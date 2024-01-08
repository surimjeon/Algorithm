import java.util.*;
class Solution{
    public int solution(String s) {
        int answer = 0;
        //같은 알파벳이 2개 붙어있는걸 제거하고 앞뒤를 이어붙임=모두 제거 종료
        // 성공 1, 아님 0
        Stack<Character> st = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            if (st.isEmpty()) {
                st.push(s.charAt(i));
            }
            else {
                if (st.peek()==s.charAt(i)) st.pop();
                else st.push(s.charAt(i));
            }
        }
        
        if (st.isEmpty()) answer=1;
        
        return answer;
    }
}