// 실패율 / N : 스테이지의 개수 => 실패율이 높은 것부터
import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        
        // 정렬해야하는 건, index이기 때문에 key값으로 list를 만들어줌
        HashMap<Integer, Double> map = new HashMap<>(); 
        for (int i=1; i<=N; i++) {
            double fail_up = 0;
            double total = 0;
            for (int j=0; j<stages.length; j++) {
                if (stages[j]>=i) total++;
                if (stages[j]==i) fail_up++;
            }
            // 분모가 0인 경우, 0/0은 nan이 나오기 떄문에 분모를 1이나 다른 숫자로 바꾸어준다 
            if (total == 0 && fail_up ==0) total = 1;
            map.put(i, fail_up / total);
        }
        List<Integer> keyset = new ArrayList<>(map.keySet());
        Collections.sort(keyset, (o1, o2) -> Double.compare(map.get(o2), map.get(o1))); // 내림차순 정렬
        
        return keyset.stream()
                    .mapToInt(Integer :: intValue)
                    .toArray();
    }
}