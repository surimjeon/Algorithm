// 최소공배수 구하기
class Solution {
    public int solution(int[] arr) {
        // 모든 값에 나눠떨어지는 최소공약수가 아님...
        //ex) 234이면, 12가 최소공약수인데, 모든 공통으로 구하려면 24가됨
        // 2개씩 최대공약수를 구해야함,,,
        int answer = 0;
        int mn = 0;
        if (arr.length==1) answer = arr[0];
        else if (arr.length==2) {
            mn = bea(arr[0], arr[1]);
            answer = arr[0]*arr[1]/mn;
        }
        else {
            mn = bea(arr[0], arr[1]);
            for (int i=2; i<arr.length; i++){
                mn = bea(mn, arr[i]);
            }
            answer = mn;
        }
        
        return answer;
    }
    public int bea(int num1, int num2) {
        int common = Math.min(num1,num2);
        int re = 1;
        for (int i=common; i>=1; i--) {
            if (num1%i==0 && num2%i==0) {
                re = i;
                break;
            }
        }
        
        int an = num1/re*num2;
        return an;
    }
}