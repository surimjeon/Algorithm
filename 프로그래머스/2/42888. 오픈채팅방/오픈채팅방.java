// 새로운 닉네임으로 바꿀 수 있는데, 그럼 이전 닉네임도 같이 변경
import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>(); //아이디, 이름
        ArrayList<String> arr = new ArrayList<>();
        
        for (int i=0; i<record.length; i++) {
            String[] words = record[i].split(" ");
            String first = words[0];
            String id = words[1];
            if (first.equals("Leave")) continue;
            String name = words[2];
            
            if (first.equals("Enter") || first.equals("Change")) {
                map.put(id, name);
            }
        }
        
        for (int i=0; i<record.length; i++) {
            String[] words = record[i].split(" ");
            String first = words[0];
            if (first.equals("Change")) continue;
            String id = words[1];
            String word ="";
            if (first.equals("Enter")) {
                word = map.get(id) + "님이 " + "들어왔습니다.";
            }
            if (first.equals("Leave")) {
                word = map.get(id) + "님이 " + "나갔습니다.";
            }
            arr.add(word);
        }
        
        String[] answer = new String[arr.size()];
        for (int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
   
}