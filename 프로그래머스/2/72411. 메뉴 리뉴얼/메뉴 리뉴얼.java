import java.util.*;

class Solution {
    static HashMap<String, Integer> map;
    static List<String> answerList = new ArrayList<>();
    public String[] solution(String[] orders, int[] course) {
        
        // 각 order의 정렬 (문자열을 정렬)
        for (int i=0; i<orders.length; i++) {
            char[] arr = orders[i].toCharArray();
            Arrays.sort(arr);
            orders[i]= String.valueOf(arr);
        }
        
        // 조합을 모두 구하기 (백트래킹)
        for (int courseLength : course) { //길이별로 다른 조합들
            map = new HashMap<>();
            for (String order : orders) {
                comb("", order, courseLength);
            }    
                // 가장 최대의 개수
                    List<Integer> cntlist = new ArrayList<>(map.values());
                    int mx = Integer.MIN_VALUE;
                    for (int cnt : cntlist) {
                        mx = Math.max(mx, cnt);
                    }

                    if (mx>1) {
                        for (String key : map.keySet()) {
                            if (map.get(key)==mx) answerList.add(key);
                        }
                    }
        }
        
        Collections.sort(answerList);
        String[] answer = new String[answerList.size()];
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
    
    
    // r은 개수, start는 시작 인덱스
    public static void comb(String s, String order, int len) {
        if (len==0) {
            map.put(s, map.getOrDefault(s,0)+1);
            return;
        }
        
        for (int i=0; i<order.length(); i++) {
            comb(s+order.charAt(i), order.substring(i+1), len-1);
        }
        
    }
}