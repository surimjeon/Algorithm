import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        //출차 내역없으면 23:59분에 출차
        //in이면 맵에 넣고, out이면 맵에서 빼서 시간차이를 저장
        //누적 주차 시간이 기본 시간이하라면, 기본 요금을 청구합니다.
        //초과한 시간이 단위 시간으로 나누어 떨어지지 않으면, 올림합니다.
        //차량 번호가 작은 자동차부터 출력
        int base_t = fees[0];
        int base_m = fees[1];
        int plus_t = fees[2];
        int plus_m = fees[3];
        
        Map<String, Integer> temp = new HashMap<>();
        Map<String, Integer> res = new HashMap<>();
        
        for (int i=0; i<records.length; i++) {
          StringTokenizer st = new StringTokenizer(records[i]);
            String[] tmp_t = st.nextToken().split(":");
            int time = Integer.parseInt(tmp_t[0])*60 + Integer.parseInt(tmp_t[1]);
            String num = st.nextToken();
            String io = st.nextToken();
            if (io.equals("IN")) {
                temp.put(num, time);
            }
            else {
                int time_diff = time-temp.get(num);
                if (res.containsKey(num)) {
                    res.put(num,res.get(num)+time_diff);
                }
                else {
                    res.put(num, time_diff);
                }
                temp.remove(num);
            }
            
        }
        //요금 계산하기 (if temp에 남아있는 아이는 빼서 23:59에서 빼고)res와 합치기
        if (!temp.isEmpty()) {
            for (String s_num : temp.keySet()) {
                if (res.containsKey(s_num)) {
                    res.put(s_num,res.get(s_num)+(1439 - temp.get(s_num)));
                }
                else {
                    res.put(s_num, 1439 - temp.get(s_num));
                }
            }
        }
        
        int[] answer = new int[res.size()];
        Map<String, Integer> sortedres = new TreeMap<>(res);
        int idx=0;
        for (String s_num : sortedres.keySet()) {
            int ans = base_m;
            if (sortedres.get(s_num)>=base_t) {
                ans += Math.ceil((float)(sortedres.get(s_num)-base_t)/plus_t)*plus_m;
            }
            answer[idx]=ans;
            idx++;
        }
        
        //res에서 if base_t보다 크거나 같으면 값-base_t한 값을 설정 
        // 올림해서 계산
        // 그런다음 res에 put함
        //collections.sort()로 정렬
        //배열만들어서 넣기
        
        
        return answer;
    }
}