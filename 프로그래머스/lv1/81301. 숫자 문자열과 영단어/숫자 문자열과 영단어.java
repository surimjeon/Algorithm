import java.util.*;
class Solution {
    public int solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        
        String temp = "";
        String ans = "";
        
        for (int i=0; i<s.length(); i++) {
            char now = s.charAt(i); 
            if (Character.isDigit(now)) { //숫자인지 먼저 확인
                ans+=now;
                temp="";
            }
            else {
                temp+=now; // 한글자씩 합치고
                if (map.containsKey(temp)) { //map에서 가져올 수 있으면
                    ans+=map.get(temp);
                    temp="";
                }
            }
        }
        int answer=Integer.parseInt(ans);
        
        return answer;
    }
}