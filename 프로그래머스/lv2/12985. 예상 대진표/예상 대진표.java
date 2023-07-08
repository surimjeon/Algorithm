class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        //각각의 순서는 /2씩 줄어든다
        while (true) {
            a = a/2 + a%2;
            b = b/2 + b%2;
            
            if (a==b) {
                break;
            }
            answer++; 
        }
        
        return answer;
    }
}