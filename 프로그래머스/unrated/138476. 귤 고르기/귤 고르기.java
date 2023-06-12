import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        // k개를 고를 떄, 크기 종류가 최소가 되도록, 그 종류의 개수를 return하도록
        // hash 사용해서 count를 할까? getordefault이고, cnt는 +1씩
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        for (int i=0; i<tangerine.length; i++) {
            int x = 1;
            if (hash.containsKey(tangerine[i])) {
                x = hash.get(tangerine[i])+1;
            }
            hash.put(tangerine[i], x);
        }
        List<Integer> lst = new ArrayList<>(hash.keySet());
        
        lst.sort((o1,o2)-> hash.get(o2).compareTo(hash.get(o1)));
        int sm =0;
        for (int j : lst) {
            sm+=hash.get(j);
            answer++;
            if (sm>=k)  break; //sm이 k보다 더 많아도 그거 하나만 담으면 되니까.. 
            
        }
        
        return answer;
    }
}