//가격이 떨어지지 않은 기간 몇초?
import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        // 스택에 넣으면서 데이터가 있는지 확인
        // 가격이 같거나 크다  = 작으면 땡
        // Stack<Integer> st = new Stack<>();
        
        int[] answer = new int[prices.length];
        
        for (int i=0; i<prices.length; i++) {
            int now = prices[i];
            int cnt = prices.length-i-1;
            for (int j=i+1; j<prices.length; j++) {
                if (now > prices[j]) {
                    cnt = j-i;
                    break;
                }
            }
            answer[i]=cnt;
        }
        
        
        
        return answer;
    }
}