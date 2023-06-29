import java.util.*;
class Solution {
    public String solution(String number, int k) {
        String answer = "";
        //정답배열
        char [] ans = new char[number.length()-k];
        Stack<Character> st = new Stack<>();
        
        for (int i=0; i<number.length(); i++) {
            char c = number.charAt(i);
            while (!st.isEmpty() && st.peek()<c && k-->0) {
                st.pop();
            }
            st.push(c);
        }
        // System.out.println(st.size());
        for (int i=0; i<ans.length; i++) {
            ans[i]=st.get(i);
        }
    
        return new String(ans);
    }
}