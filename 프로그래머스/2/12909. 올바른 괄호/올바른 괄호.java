import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='(') st.push(s.charAt(i));
            else {
                if (st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }
        
        if (!st.isEmpty()) answer=false; 

        return answer;
    }
}