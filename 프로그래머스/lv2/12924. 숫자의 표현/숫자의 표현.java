class Solution {
    public int solution(int n) {
        int answer = 0;
        //연속한 수로 n을 표현하는 방법의 수 = 완탐ㅇㅇ
        for (int i=1; i<=n; i++) {
            int temp=0; //매번 같은값 갱신 
            for (int j=i; j<=n; j++) {
                temp+=j;
                if (temp==n) {
                    answer++;
                    break;
                }
                else if (temp>n) {
                    break;
                }
            }
        }
        
        return answer;
    }
}