import java.util.*;
class Solution {
    static int mn = Integer.MAX_VALUE;
    public int solution(int x, int y, int n) {
        int answer = 0;
        
        int[] dp = new int[y+1];
        
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[x]=0;
        
        for (int i=x; i<=y; i++) {
            if (dp[i]==Integer.MAX_VALUE) continue;
            if (i+n<=y) {
                dp[i+n] = Math.min(dp[i]+1, dp[i+n]);     
            }
            if (i*2<=y) {
                dp[i*2] = Math.min(dp[i]+1, dp[i*2]);
            }
            if (i*3<=y) {
                dp[i*3] = Math.min(dp[i]+1, dp[i*3]);
            }
        }
        if(dp[y]==Integer.MAX_VALUE) answer = -1;
        else answer = dp[y];
        
        return answer;
    }
    
}