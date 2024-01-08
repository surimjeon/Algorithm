// 메모이제이션으로 안풀면, 정수범위값을 넘어감
class Solution {
    public int solution(int n) {
        int[] memo = new int[n+1];
        memo[0]=0;
        memo[1]=1;
        memo[2]=1;
        
        for (int i=3; i<=n; i++){
            memo[i]=(memo[i-1]+memo[i-2])%1234567;
        }
        
        int answer = memo[n];
        
        return answer;
    }
    
}