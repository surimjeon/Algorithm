import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        // 0부터 9까지 배열을 만들고
        //그걸 하나씩 집어넣으면서 그 배열에 몇개있는지 -> 그 반대로 돌면서 하나씩??
        int[] x = new int[10];
        int[] y = new int[10];
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<X.length(); i++) {
            x[X.charAt(i)-'0']++;
        }
        
        for (int i=0; i<Y.length(); i++) {
            y[Y.charAt(i)-'0']++;
        }
        
        for (int j=9; j>=0; j--) {
            if (x[j]!=0 && y[j]!=0) {
                int mn=Math.min(x[j], y[j]);
                for (int i=0; i<mn; i++) {
                    sb.append(j);
                }
            }
        }
        answer=sb.toString();
        if (answer.equals("")) {
            answer="-1";
        }
        else if (answer.substring(0,1).equals("0")) {
            answer="0";
        }
        
        return answer;
    }
}