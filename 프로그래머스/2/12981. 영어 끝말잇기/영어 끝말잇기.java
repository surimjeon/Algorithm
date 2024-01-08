//중복x, 마지막 문자x, 한글자 안돼
// 탈락하는 사람 번호, 몇번째에 탈락하는지 
import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int num =0, cnt =0;
        ArrayList<String> arr = new ArrayList<>();
        char last = words[0].charAt(words[0].length()-1);
        arr.add(words[0]);
        for (int i=1; i<words.length; i++) {
            if (last!=words[i].charAt(0) || arr.contains(words[i])) {
                num=i%n+1;
                cnt=i/n+1;
                break;
            }
            arr.add(words[i]);
            last = words[i].charAt(words[i].length()-1);
        }
        int[] answer = new int[]{num,cnt};
        
        return answer;
    }
}