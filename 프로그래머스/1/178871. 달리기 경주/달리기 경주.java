// 바로 자기 앞의 선수를 추월하면 이름을 부름
import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        //map을 써서 순위를 조작?? 아님,,
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        for (int i=0; i<callings.length; i++) {
            int now = map.get(callings[i]);
            String before = players[now-1];
            
            players[now] = before;
            players[now-1] = callings[i];

            map.put(callings[i], now-1);
            map.put(before, now);
        }
        
        
        
        return players;
    }
}