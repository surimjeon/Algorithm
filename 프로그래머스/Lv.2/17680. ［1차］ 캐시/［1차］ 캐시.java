// 실행시간(가장 오랫동안 사용하지 않은 것 교체) => miss이면 5, hit면 1
// 배열 크기 3개 <- 없으면 5하고, 가장 오래안쓴 위치에 교체
// 있으면 +1 /0이면 모두 +5
import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        // cacheSize= 5;
        // cities = {"a", "b", "c", "b", "a"};
        int answer = 0;
        Queue<String> q = new LinkedList<>();
        if (cacheSize==0) return cities.length*5;
        for (String city : cities) {
            city = city.toUpperCase();
            if (q.contains(city)) {
                answer+=1;
                q.remove(city);
                q.offer(city);
            }
            else {
                if (q.size()<cacheSize) q.add(city);
                else {
                    q.poll();
                    q.add(city);
                }
                answer+=5;
            }
        }
        return answer;
    }
}