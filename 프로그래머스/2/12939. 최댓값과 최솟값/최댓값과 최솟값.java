import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] temp = s.split(" ");
        
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        for (int i=0; i<temp.length; i++) {
            if (mn>Integer.parseInt(temp[i])) mn = Integer.parseInt(temp[i]);
            if (mx<Integer.parseInt(temp[i])) mx = Integer.parseInt(temp[i]);
        }
        answer+=mn;
        answer+=" ";
        answer+=mx;
        
        return answer;
    }
}