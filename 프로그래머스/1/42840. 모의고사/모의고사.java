import java.util.*;
//1~5까지 반복 / 2 + 1,3,4,5(8개) / 33 11 22 44 55 (10개)
class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> arr = new ArrayList<>(); 
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        int one_cnt = 0, two_cnt = 0, three_cnt = 0;
        for (int i=0; i<answers.length; i++) {        
            if (answers[i]==one[i%one.length]) one_cnt++;
            if (answers[i]==two[i%two.length]) two_cnt++;
            if (answers[i]==three[i%three.length]) three_cnt++;
        }
        int mx = Math.max(Math.max(one_cnt, two_cnt), three_cnt);
        
        if (one_cnt>=mx) arr.add(1);
        if (two_cnt>=mx) arr.add(2);
        if (three_cnt>=mx) arr.add(3);
        
        return arr.stream()
                .mapToInt(i->i)
                .toArray();
    }
}