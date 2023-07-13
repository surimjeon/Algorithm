import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        // 1231이어야 함 스택
        
        for (int i=0; i<ingredient.length; i++) {
            st.push(ingredient[i]);
            if (st.size()>=4) {
                if (st.get(st.size()-4)==1 && //if 4이면 0인덱스부터 시작
                   st.get(st.size()-3)==2 &&
                   st.get(st.size()-2)==3 &&
                   st.get(st.size()-1)==1) {
                    for (int j=0; j<4; j++) {
                        st.pop();
                    }
                    answer++;
                }
            }
        }
        return answer;
    }
}