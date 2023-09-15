import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown+yellow;
        //1 2 3 4 6 12
        
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i =1; i<=yellow; i++) {
            if(yellow%i==0 && total%(i+2)==0) {
                answer[1]=Math.min(i+2, total/(i+2));
                answer[0]=Math.max(i+2, total/(i+2));
            }
        }
        
        
        return answer;
    }
}