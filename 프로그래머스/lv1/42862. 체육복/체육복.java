import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int total =n-lost.length;
        // boolean [] check = new boolean[n+1];
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int i=0; i<lost.length; i++) {
            for (int j=0; j<reserve.length; j++) {
                if (reserve[j]==lost[i]) {
                    total++;
                    reserve[j]=-1;
                    lost[i]=-1; // 체육복 가져온애가 도난당하는 상황이고, 다른 아이에게는 체육복 빌려줄 수x
                }
            }
        }
        
        
        for (int i=0; i<lost.length; i++) {
            for (int j=0; j<reserve.length; j++) {
                if (reserve[j]==lost[i]-1 || reserve[j]==lost[i]+1 ) {
                    total++;
                    reserve[j]=-1;
                    lost[i]=-1;
                }
            }
        
        }
        return total;
    }
}