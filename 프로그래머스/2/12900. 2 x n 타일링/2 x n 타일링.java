// 가로2*세로1 = 2*n채우기=> 방법의 수
// n=1 1 n=2 2, n=3 2, n=4 4, n=5 6개??22
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] ans = new int[n+1];
        ans[1]=1;
        ans[2]=2;
        for (int i=3; i<n+1; i++) {
            ans[i] = (ans[i-2]+ans[i-1])%1000000007;
        }
        
        answer= ans[n];
        return answer;
    }
}