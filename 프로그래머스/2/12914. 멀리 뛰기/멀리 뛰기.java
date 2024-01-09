// 한번에 1칸 또는 2칸을 뛸 수 있음=> 경우의 수는?
class Solution {
    public long solution(int n) {
        long answer = 0;
        long[] dp = new long[2001];
        // dp[1]=1, 2->2, 3->3, 4-> 5, 5->8
        dp[1]=1;
        dp[2]=2;
        
        for (int i=3; i<=n; i++) {
            dp[i]=(dp[i-1]+dp[i-2])%1234567;
        }
        
        answer = dp[n];
        
        return answer;
    }
}