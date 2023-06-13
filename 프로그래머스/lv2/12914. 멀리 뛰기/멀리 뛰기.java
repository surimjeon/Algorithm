class Solution {
    public long solution(int n) {
        long[] memo = new long[n+2]; //최대값
        memo[1]=1;
        memo[2]=2;
        
        for (int i=3; i<n+1; i++) {
            memo[i]=(memo[i-1]+memo[i-2])%1234567; //DP
        }
        return memo[n];
    }
}