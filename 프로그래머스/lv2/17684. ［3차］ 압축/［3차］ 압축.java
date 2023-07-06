import java.util.*;
class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> map = new HashMap<>(); 
        List<Integer> lst = new ArrayList<>(); 
        char base = 'A';
        for (int i=1; i<=26; i++) {
            map.put(String.valueOf(base), i);
            base++;
        }
        
        int prev=0;
        int num=27;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<msg.length(); i++) {
            sb.append(msg.charAt(i));
            if(map.containsKey(sb.toString())) { //sb string으로 바꾸기 위해 toString사용
                prev = map.get(sb.toString()); //현재 딕셔너리값prev              
            }
            else {
                map.put(sb.toString(), num++);
                lst.add(prev); //containskey가 아닐때만 put해서 없는 문자열일 떄 add하기
                prev=0;
                sb.setLength(0);
                i--; // i감소
            }
        }
        if(prev!=0) {
            lst.add(prev);
        }
        
        int [] answer = new int[lst.size()];
        for (int i=0; i<lst.size(); i++) {
            answer[i]=lst.get(i);
        }
        
        return answer;
    }
}