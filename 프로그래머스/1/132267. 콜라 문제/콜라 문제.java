// 빈병 a, 콜라 b병 줌 -> a개 미만이면 빈병 x => n개는 몇병을 받음? 
//3, 2, 20
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        // a=3;
        // b=2;
        // n=20;
        // b=2;
        while (n>=a) {
            answer+=(n/a)*b;
            n=n-a*(n/a)+(n/a)*b;
        }
        
        return answer;
    }
}