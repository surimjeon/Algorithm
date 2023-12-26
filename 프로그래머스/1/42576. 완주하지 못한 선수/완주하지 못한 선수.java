import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int j=0; j<completion.length; j++) {
            if (map.containsKey(completion[j])) {
                 map.put(completion[j], map.get(completion[j])+1);
            }
            else map.put(completion[j],1);
        }
        
        for (int i=0; i<participant.length; i++) {
            if (map.containsKey(participant[i])) {
                if (map.get(participant[i])==0) {
                    answer = participant[i];
                    break;  
                }
                else {
                map.put(participant[i], map.get(participant[i])-1);
                }
            }
            else  {
                answer = participant[i];
                break; } 
            
        }
        return answer;
    }
}