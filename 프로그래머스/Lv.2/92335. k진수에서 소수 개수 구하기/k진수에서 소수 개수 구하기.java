import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String num = "";
        
        while (n!=0) {
            num = n%k+num;
            n/=k;
        }
        
        String[] arr = num.split("0");
        
        for (String ar : arr) {
            if (ar.equals("")) continue;
            Long number = Long.parseLong(ar);
            if (isprime(number)) answer++;
        }
        return answer;
    }
    //소수판정 알고리즘
    public static boolean isprime(long num) {
        if (num<2) return false;
            for (int i=2; i<=Math.sqrt(num); i++) {
                if (num%i==0) {
                    return false;
                }
            }
        
        return true;
    }

}