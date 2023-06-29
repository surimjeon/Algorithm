import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int answer[] = new int [(int) (right-left+1)];
        for (int i=0; i<answer.length; i++) {
            int row = (int) ((left+i) /n)+1; //지정왼쪽값+i번째 = 행
            int col = (int) ((left+i)%n)+1;
            
            answer[i]=Math.max(row,col);
        }
        
        
        
        return answer;
    }
}