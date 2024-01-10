// 원형 큐..(인덱스를 %로 풀기...) set으로 풀기..
import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for (int i=1; i<=elements.length; i++) { //부분수열의 원소 개수
            for (int j=0; j<elements.length; j++) { //시작인덱스부터
                int sum =0;
                for (int k=j; k<j+i; k++) {
                    sum+=elements[k%elements.length];
                }
                set.add(sum);
            }
            
        }
        
        answer = set.size();
        
        
        
        return answer;
    }
}