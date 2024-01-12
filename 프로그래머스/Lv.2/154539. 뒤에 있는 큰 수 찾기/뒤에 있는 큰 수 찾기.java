import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        Stack<Integer> st = new Stack<>();
        
        //마지막은 -1로 끝나야하기 때문에 뒤에서부터
        for (int i=numbers.length-1; i>=0; i--) {
            while (!st.isEmpty()) {
                if (st.peek()>numbers[i]) {
                    answer[i]=st.peek();
                    break; 
                    }
                else {
                    st.pop(); //하나씩 빼보면서 뒤쪽에 더 큰게 있는지 보기
                }
            }
            if (st.isEmpty()) {
                answer[i]=-1;  //끝까지 뺐는데, 큰게 없다면 -1
            }
            st.push(numbers[i]); //본인을 stack에 넣음
            }
        
        return answer;
    }
}