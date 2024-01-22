// 공평하게 자르는 방법의 수
import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        // set에 넣을 수 있는것들을 넣으면서 하나씩 잘라보자
        HashSet<Integer> set1 = new HashSet<>(); //밖에 뺴고,,
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i=0; i<topping.length; i++) {
            map.put(topping[i], map.getOrDefault(topping[i],0)+1);
        }
        
        for (int i=0; i<topping.length; i++) {
            set1.add(topping[i]);
            map.put(topping[i], map.get(topping[i])-1);
            
            if (map.get(topping[i])==0) {
                map.remove(topping[i]);
            }
            
            if (set1.size() == map.size()) answer++;
            
        }
        return answer;
    }
}