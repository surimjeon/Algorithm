// 더 선물을 많이 준사람이 선물 <-적게준 사람 +1 or 하나도 없거나 같으면, 선물지수가 더 큰사람<- 더 작은 사람에게 선물 +1 / 선물지수도 같으면 선물 주고받지x
// 선물지수 = 자신이 준 선물의 수 - 받은 선물의 수
import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        HashMap<String, Integer> idx_map = new HashMap<>();
        int[][] mapp = new int[friends.length][friends.length];
        //선물 지수 배열
        int[] num_map = new int[friends.length];
        // 다음달에 가장 많은 선물받는 친구가 받을 선물의 수
        for (int i=0; i<friends.length; i++) {
            idx_map.put(friends[i], i);
        }
        
        for (int i=0; i<gifts.length; i++) {
            String[] gift = gifts[i].split(" ");
            String from = gift[0];
            String to = gift[1];
            mapp[idx_map.get(from)][idx_map.get(to)]++;
            num_map[idx_map.get(from)]++;
            num_map[idx_map.get(to)]--;
        }

        for (int i=0; i<friends.length; i++) {
            int num = 0; // 각자 받은 선물의 수
            for (int j=0; j<friends.length; j++) {
                if (i==j) continue;
                
                if (mapp[j][i]<mapp[i][j] || 
                   (mapp[i][j] == mapp[j][i] && num_map[j]< num_map[i])) {
                    //i가 j에게
                    num++;
                }
            }
            answer = Math.max(num, answer);
        }
        return answer;
    }
}