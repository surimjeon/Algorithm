import java.util.*;

class Solution
{
    public int solution(String s)
    {   
        int answer = 0;
        //앞에 저장되어있는 문자와 동일해야 없앨 수 있기 때문에 stack사용해서
        //앞의 문자와 같은지 보기
        Stack<Character> st = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            if (st.isEmpty()) {
                st.push(s.charAt(i));
                continue;
            }
            if(st.peek() == s.charAt(i)) {
                st.pop();
            }
            else {
                st.push(s.charAt(i));
            }
        }
        
        if (st.isEmpty()) {
            answer=1;
        }
        
        return answer;
    }
}