//알 수없는 번호 0, lottos : 민우꺼, win_nums: 당첨번호
// 7 - 맞는 번호 수 = 1,0개는 6 
import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        int zero = 0, corr = 0;
        for (int lotto : lottos) {
            if (lotto==0) {
                zero++;
                continue;
            }
            
            for (int win : win_nums) {
                if (lotto==win) {
                    corr++;
                    break;}
            }
        }
        int mn = change(corr);
        int mx = change(zero + corr);
        
        answer.add(mx);
        answer.add(mn);
        
        return answer.stream()
                    .mapToInt(i->i)
                    .toArray();
    }
    public static int change(int num) {
        int grade = 7-num;
        if (grade==7) grade=6;
        return grade;
    }
}