import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<tangerine.length; i++) {
            if (map.containsKey(tangerine[i])) {
                map.put(tangerine[i], map.get(tangerine[i])+1);
            }
            else {
                map.put(tangerine[i], 1);
            }
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        
        Collections.sort(keys, (a1, a2)->(map.get(a2).compareTo(map.get(a1))));
        
        
        for (int key : keys) {
            if (k<=0) break;
            answer++;
            k-=map.get(key);
        }
        
        return answer;
    }
}