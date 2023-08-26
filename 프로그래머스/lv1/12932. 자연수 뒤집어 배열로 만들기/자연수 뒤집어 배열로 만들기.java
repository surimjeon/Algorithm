import java.util.*;

class Solution {
    public int[] solution(long n) {
        String st = Long.toString(n);
        int[] answer = new int[st.length()];
        for (int i=st.length()-1; i>=0; i--) {
            answer[st.length()-1-i]=st.charAt(i)-'0';
        }
        return answer;
    }
}