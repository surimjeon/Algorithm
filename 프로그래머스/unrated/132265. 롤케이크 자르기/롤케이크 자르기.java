import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for (int i=0; i<topping.length; i++) {
            if (map.containsKey(topping[i])) {
                map.put(topping[i], map.get(topping[i])+1);
            }
            else {
                map.put(topping[i],1);
            }
        }
        
        for (int j=0; j<topping.length; j++) {
            set.add(topping[j]); //set에서 넣고
            map.put(topping[j], map.get(topping[j])-1); //map에는 무조건 -1 빼기
            if (map.get(topping[j])==0) {
                map.remove(topping[j]);
            }
            
            if (map.size() == set.size()) {
                answer++;
            }
            
        }
        return answer;
    }
}