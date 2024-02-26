// 거리가d를 넘는 위치에는 찍지 않음(그 안에만) - a,b 숫자만 바꿔서 해본다 
class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        //원점과의 거리를 재기
        //a제곱과 b제곱이 d의 제곱보다 작아야함 A**2 + B**2 <= D**2
        for (long a=0; Math.pow(a*k,2) <= Math.pow(d,2); a++) {
            //a가 정해져있을 때, b를 몇개로 할 수 있을지에 대한 경우의 수 구하기
            double b2 = Math.pow(d,2)-Math.pow(a*k, 2); // 16 - 16 = 8
            answer += (long) Math.sqrt(b2)/k; // b가 0,1,2 / n 0 1 
            answer++;
        }
        
            
        return answer;
    }
}