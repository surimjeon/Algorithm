// goal만들 수있다면 yes, 아님 no
import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        //하나도 안맞을 경우 고려
        boolean check = false;
        
        int one =0; int two =0;
        // 목표단어들을 하나씩 비교
        for (int i=0; i<goal.length; i++) {
            if (one<cards1.length && goal[i].equals(cards1[one])) {
                one++;
                check=true;
                continue;
            }
            
            if (two<cards2.length && goal[i].equals(cards2[two])) {
                two++;
                check=true;
                continue;
            }
        }
        
        if (one+two<goal.length || !check) answer="No";
        return answer;
    }
}