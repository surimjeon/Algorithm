import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        int ln=record.length;
        //해쉬맵으로 id-닉네임을 연결시켜서 닉네임이 바뀔 때 같은 id도 모두 바뀌도록
        HashMap<String, String> hash = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        
        int cnt=0;
        for(int i=0; i<ln; i++) {
             StringTokenizer st = new StringTokenizer(record[i]);
            String doing=st.nextToken();
            String userid=st.nextToken();
            String nickname=""; //""로 초기화해줘야 토큰을 받지 않아도 사용가능하다
            
            //leave일 때는 2개만 주어짐
            if(!doing.equals("Leave")){
                nickname = st.nextToken();
            }
            if (doing.equals("Enter")) {
                hash.put(userid,nickname);
                arr.add(userid+"님이 들어왔습니다.");
            }
            else if (doing.equals("Leave")) {
                arr.add(userid+"님이 나갔습니다.");
            }
            else {
                hash.put(userid,nickname);
            }
        }
        String[] answer = new String[arr.size()];
        int idx =0;
        for (String chat : arr) {
            int end = chat.indexOf("님");
            String userId = chat.substring(0,end);
            answer[idx++] = chat.replace(userId, hash.get(userId));
            
        }
        
        return answer;
        
    }
}