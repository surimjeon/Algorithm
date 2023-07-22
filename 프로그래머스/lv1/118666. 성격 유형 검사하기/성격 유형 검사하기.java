import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer ="";
        char[][] c = {{'R','T'},{'C','F'},{'J','M'},{'A','N'}};
        Map<Character, Integer> mapp = new HashMap<>(); 
        
        for (int i=0; i<survey.length; i++) {
            if (choices[i]<4) {
                char left = survey[i].charAt(0);
                mapp.put(left,mapp.getOrDefault(left, 0)+4-choices[i]);
            }
            else if (choices[i]>4) {
                char right = survey[i].charAt(1);
                mapp.put(right,mapp.getOrDefault(right,0)+choices[i]-4);
            }
        }
        for (int i=0; i<4; i++) {
            answer+= (mapp.getOrDefault(c[i][0],0)>=mapp.getOrDefault(c[i][1],0) ? c[i][0] : c[i][1]);
        }
        
        return answer;
    }
}