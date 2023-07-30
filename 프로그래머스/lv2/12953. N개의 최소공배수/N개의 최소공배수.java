import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        //최소공배수 반환
        //최대공약수를 먼저 구해서, 그걸로 나눈 값들을 모두 곱한다
        if (arr.length ==1) {
            answer=arr[0];
        }
        int g = gcd(arr[0], arr[1]); //최대공약수
        answer = (arr[0]*arr[1])/g;
        
        if (arr.length>2) {
            for (int i=2; i<arr.length; i++) {
                int temp_g = gcd(answer, arr[i]);
                answer = (answer*arr[i])/temp_g;
            }
        }
        
        return answer;
    }
    public static int gcd(int first, int second) {
        int value = first%second;
        if (value==0) {return second;}
        else {return gcd(second,value);}
    }
}