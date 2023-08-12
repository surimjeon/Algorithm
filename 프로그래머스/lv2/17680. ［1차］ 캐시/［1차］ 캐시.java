import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> q = new LinkedList<>();
        if (cacheSize==0) {
            answer=cities.length*5;
            return answer;
        }
        
        for (int i=0; i<cities.length; i++) {
            cities[i] = cities[i].toUpperCase();
            if (q.contains(cities[i])) {
                q.remove(cities[i]); //recently use
                q.add(cities[i]); 
                answer++;
            }
            else {
                if (q.size()!=cacheSize) {
                    q.add(cities[i]);
                }
                else {
                    q.poll();
                    q.add(cities[i]);
                }
                answer+=5;
            }
        
        }
        return answer;
    }
}