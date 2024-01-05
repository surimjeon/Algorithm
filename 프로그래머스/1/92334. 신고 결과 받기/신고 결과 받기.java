import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> idxmap = new HashMap<>();
        HashMap<String, HashSet<String>> map = new HashMap<>();
        
        
        for (int i=0; i<id_list.length; i++) {
            map.put(id_list[i], new HashSet<>());
            idxmap.put(id_list[i], i);
        }
        
        for (String re : report) {
            String[] temp = re.split(" ");
            String from = temp[0];
            String to = temp[1];
            map.get(to).add(from);
        }
        
        for (int i=0; i<id_list.length; i++) {
            HashSet<String> hs = map.get(id_list[i]); 
            if (hs.size()>=k) {
                //set의 모든 유저대상으로 answer++
                for (String h : hs) {
                    answer[idxmap.get(h)]++;
                }
            }
        }
        
        
        return answer;
    }
}