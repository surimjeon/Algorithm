//모든 달은 28일까지, 오늘날짜로 파기해야할 번호 구하기 
// 오늘날짜기준 약관 유효기간 terms, ->오름차순 
import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i=0; i<terms.length; i++) {
            String[] ch = terms[i].split(" ");
            map.put(ch[0].charAt(0), Integer.parseInt(ch[1]));
        }
        
        for (int i=0; i<privacies.length; i++) {
            String[] str = privacies[i].split(" ");
            String date = str[0];
            char term = str[1].charAt(0);
            
            if (change(today) > change(date) + map.get(term)*28 -1) {
                arr.add(i+1);
            }
        }
        
        int[] answer = arr.stream()
                .mapToInt(i->i)
                .sorted()
                .toArray();
            
        return answer;
    }
    
    public int change(String str) {
        String[] date = str.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        
        return year*12*28 + month*28 + day;
        
    }
}