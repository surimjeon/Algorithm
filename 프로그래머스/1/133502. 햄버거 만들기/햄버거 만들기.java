//1 - 2- 3 - 1
import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (int ing : ingredient) {
            st.push(ing);
            //스택 크기가 4이상이면, 무조건 체크해서 맞는지 체크
            if (st.size()>=4) {
                if (st.get(st.size()-1)==1 && st.get(st.size()-2)==3 && st.get(st.size()-3)==2 && st.get(st.size()-4)==1) {
                    answer++;
                    for(int i=0; i<4; i++) st.pop();
                }
            }
        }
        
        
        return answer;
    }
   
}