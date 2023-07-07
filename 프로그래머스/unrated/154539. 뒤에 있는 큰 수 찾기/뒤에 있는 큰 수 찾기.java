import java.util.*;
//가장 가까이 있는 가장 큰 수..->보관할 수 있는 곳이 필요
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        Stack<Integer> st= new Stack<>();
       st.push(0);
        for (int i=1; i<numbers.length; i++) {
            while (!st.isEmpty() && numbers[st.peek()]<numbers[i]) {
                
                answer[st.pop()] = numbers[i];
            } //empty이거나 numbers 뒤의 수가 작으면 push
            st.push(i);
            }
            
        while (!st.isEmpty()) {
            answer[st.pop()] = -1;
        }
        
        
        return answer;
    }
}