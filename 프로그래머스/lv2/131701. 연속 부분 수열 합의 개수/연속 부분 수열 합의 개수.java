import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        //deque로 구현
        //set으로 합 구하기 
        Set<Integer> set = new HashSet<>();
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int i=0; i<elements.length; i++) {
            dq.add(elements[i]);
        }
        
        for (int i=1; i<=elements.length; i++) { //부분수열 개수
            for (int j=0; j<elements.length; j++) { //현재 위치
                int temp_sum=0;
                for (int k=0; k<i; k++) {
                    int now = j+k;
                    if(now>=elements.length) {
                        now%=elements.length;
                    } 
                    temp_sum+=elements[now];
                }
             set.add(temp_sum);   
            }
        }
        answer=set.size();
        
        return answer;
    }
}