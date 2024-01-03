// 키를 최소 몇 번씩 눌러야 하는지 배열, 작성 못하면 -1
// map/배열을 써서 더 최소인 걸 담아놓고, 찾기??
import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i=0; i<keymap.length; i++) {
            String temp = keymap[i];
            for (int j=0; j<temp.length(); j++) {
                char key = temp.charAt(j);
                if (map.containsKey(key)) {
                    map.put(key, Math.min(map.get(key), j+1));
                }
                else map.put(key, j+1);
            }
        }
        
        for (int i=0; i<targets.length; i++) {
            String temp = targets[i];
            int sum = 0;
            for (int j=0; j<temp.length(); j++) {
                char key = temp.charAt(j);
                if (map.containsKey(key)) sum+=map.get(key);
                else {
                    sum=-1;
                    break; 
                }
            }
            answer[i]=sum;
        }
        
        return answer;
    }
}