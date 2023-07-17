import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        boolean[] sign = new boolean[id_list.length];
 
        Map<String, HashSet<String>> map = new HashMap<>(); //from, to저장
        Map<String, Integer> idx_map = new HashMap<>();
        
        for (int i=0; i<id_list.length; i++) {
            map.put(id_list[i], new HashSet<>());
            idx_map.put(id_list[i], i);
        }

        for (int i=0; i<report.length; i++) {
            String from = report[i].split(" ")[0];
            String to = report[i].split(" ")[1];
           
            map.get(to).add(from); //map에서 to값을 가져와서(hashset) from을 추가
        }
        for (int i=0; i<id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]);
            if (send.size() >=k) {
                for (String name:send) {
                    answer[idx_map.get(name)]++;
                }
            }
        }
        
        
        //동일한 유저는 1회로 처리
        //k번 이상 신고된 유저는 정지, 신고한 사람에게 정지메일 발송
        //뒷값을 기준으로 count하고 값이 2이상인 key가 report의 1번째 요소에
        //인덱스를 +1씩 함
        
        
        return answer;
    }
}