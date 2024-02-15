// 2, 3, 4M에 좌석이 있음 -> 탑승사람 * 좌석간 거리 가 같음 (시소짝꿍) -> 1:2 / 2:3 / 3:4 / 1:1 -> 조합이기 때문에 상쇄시키지 않고, 누적해서 더해간다
import java.util.*;
class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights);
        HashMap<Double, Integer> map = new HashMap<>();
        //맵에 하나씩 담기
        for (int w : weights) {
            double a = w*1.0;
            double b = (w*2.0)/3.0;
            double c = (w*1.0)/2.0;
            double d = (w*3.0)/4.0;
            if (map.containsKey(a)) answer+=map.get(a);
            if (map.containsKey(b)) answer+=map.get(b);
            if (map.containsKey(c)) answer+=map.get(c);
            if (map.containsKey(d)) answer+=map.get(d);
            map.put((w*1.0), map.getOrDefault((w*1.0),0)+1); 
        }
        
        return answer;
    }
}