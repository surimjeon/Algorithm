class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        //a는 b와 붙기 전까지 항상이기고, 몇번째 라운드에서 만나나요?
        //12 /34 /56 / 78
        // 1 / 4 / 5 / 7     /// 4->2->1 / 8->4->2 (옆수이면 count종료)
        
        while(a!=b) {
            a=(a+1)/2;
            b= (b+1)/2;
            answer++;
        }
        
        
        return answer;
    }
}