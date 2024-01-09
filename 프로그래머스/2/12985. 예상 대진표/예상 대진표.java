//토너먼트, a가 b와 몇번째 라운드 만나는지 , a와 b는 항상이김
class Solution {
    public int solution(int n, int a, int b) { 
        int answer = 1;
        
        while (Math.abs(a-b)!=1 || a/2==b/2) {
            a=check(a);
            b=check(b);
            answer++;
        }
        
        return answer;
    }
    public int check(int num) {
        if (num%2==1) return num/2+1;
        else return num/2;
    }
}