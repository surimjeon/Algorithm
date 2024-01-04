// 사전 순으로 빠른 성격 유형 RFMN"이나 "TCMA"
// map은 put
import java.util.*;
class Solution {
    static HashMap<Character, Integer> map = new HashMap<>();
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        map.put('R', 0); //1번 지표
		map.put('T', 0);
		map.put('C', 0); //2번 지표
		map.put('F', 0);
		map.put('J', 0); //3번 지표
		map.put('M', 0);
		map.put('A', 0); //4번 지표
		map.put('N', 0);
        
        
        for (int i=0; i<survey.length; i++) {
            if (choices[i]<4) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0))+4-choices[i]);
            }
            else if (choices[i]==4) continue;
            else {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1))+choices[i]-4);
            }
        }
        
        answer+= map.get('R') >= map.get('T') ? 'R' : 'T';
        answer+= map.get('C') >= map.get('F') ? 'C' : 'F';
        answer+= map.get('J') >= map.get('M') ? 'J' : 'M';
        answer+= map.get('A') >= map.get('N') ? 'A' : 'N';
        
        return answer;
    }
    
}