import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
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
        return new StringBuilder()
            .append(mapp.getOrDefault('R',0) >= mapp.getOrDefault('T',0) ? 'R':'T')
            .append(mapp.getOrDefault('C',0) >= mapp.getOrDefault('F',0) ? 'C':'F')
            .append(mapp.getOrDefault('J',0) >= mapp.getOrDefault('M',0) ? 'J':'M')
            .append(mapp.getOrDefault('A',0) >= mapp.getOrDefault('N',0) ? 'A':'N')
            .toString();
    }
}