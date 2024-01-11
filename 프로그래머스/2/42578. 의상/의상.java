// 모든 경우의 수 (각 종류에서 하나만 입어도 댕) => 맵에 넣고, 종류개수만큼 하나씩 더 입어도 댕
import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        // a+b+ab = (a+1)(b+1)-1  
        // a+b+c + ab/ac/bc + abc => 식으로 바꾸기 
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<clothes.length; i++) {
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }
        
        
        for (String k : map.keySet()) {
            answer*=(map.get(k)+1);
        }
        
        answer-=1;
        
        
        
        
        
        return answer;
    }
}