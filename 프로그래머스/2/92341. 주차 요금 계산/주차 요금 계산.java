// map은 put.. 
// 주차시간을 채우려면 for문돌면서 출차있으면, map에 넣고, 있는지는 이후꺼로 보고
//차량번호 작은자동차부터 청구할 주차요금
import java.util.*; 
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int basetime = fees[0];
        int basefee = fees[1];
        int time = fees[2];
        int fee = fees[3];
        
        HashMap<String, Integer> map = new HashMap<>();
        TreeMap<String, Integer> ans = new TreeMap<>();
        
        for (String record : records) {
            String[] s = record.split(" ");
            if (s[2].equals("IN")) {
                map.put(s[1], change(s[0]));
            }
            else {
                int v =change(s[0]) - map.get(s[1]);
                //map에서 빼기 제거시키기
                ans.put(s[1], ans.getOrDefault(s[1],0)+v);
                map.remove(s[1]);
            } 
        }
        
        if (!map.isEmpty()) {
            for (String k : map.keySet()) {
                int v = change("23:59") - map.get(k);
                ans.put(k, ans.getOrDefault(k,0)+v);
            }
        }
        
        int[] answer = new int[ans.size()];
        
        int idx = 0;
        for (String k : ans.keySet()) {
            int t = ans.get(k);
            if (t >= basetime) {
                answer[idx] = basefee + ((t-basetime)/time + ((t-basetime)%time==0 ? 0:1)) * fee;
            }
            else {
                answer[idx] = basefee;
            }
            idx++;
        }
        
        
        return answer;
    }
    public int change(String time) {
        String[] s = time.split(":");
        int t = Integer.parseInt(s[0])*60 + Integer.parseInt(s[1]);
        return t;
    }
}