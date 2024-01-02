// * : 해당 점수, 전점수 각 2배(중첩되면 4배), # : 해당 점수 - 
import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int idx = 0;
        String num = ""; // num는 한자리 숫자가 아닐 수 있기 때문에 문자열로 정의해야함
        double[] arr = new double[dartResult.length()+1];
        for (int i=0; i<dartResult.length(); i++) {
            char currentchar = dartResult.charAt(i);
            
            if (Character.isDigit(currentchar)) {
                num+=currentchar;
            }
            else if (currentchar=='S' || currentchar=='T' || currentchar=='D'){
                arr[idx] = change(Integer.parseInt(num), currentchar);
                num="";
                idx++;
            }
            else {
                if (currentchar=='*') {
                arr[idx-1]*=2;
                if (idx>=2) arr[idx-2]*=2;
                }
                else if (currentchar=='#') {
                    arr[idx-1]*=(-1);
                }
            }
        }
        for (int i=0; i<arr.length; i++) {
                answer+=arr[i];
            System.out.println(arr[i]);
            }
        return answer;
    }
    
    public static double change(int num, char a) {
        if (a=='S') {
            return Math.pow(num, 1);
        }
        else if (a=='D') {
            return Math.pow(num, 2);
        }
        else {
            return Math.pow(num, 3);
        }
    }
}