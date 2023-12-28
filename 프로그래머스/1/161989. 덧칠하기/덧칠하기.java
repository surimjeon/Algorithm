// 총 n개, m미터 롤러길이, section: 다시 칠하기로한 구역 번호
import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        
        int mn = section[0];
        for (int i=1; i<section.length; i++) {
            if (section[i]<=mn+m-1) continue;
            else {
                mn=section[i];
                answer++;
            }
        }
        
        return answer;
    }
}