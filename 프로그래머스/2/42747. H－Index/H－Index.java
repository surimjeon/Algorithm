// n편 중 h번 이상 인용된 논문이 h편 이상인용되면, h최대값 
// [0,1,3,5,6] 
import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
                
        for (int i=0; i<citations.length; i++) {
            if (citations[i]>=citations.length-i) {
                answer = citations.length-i;
                break;
            }
        }
        return answer;
    }
}