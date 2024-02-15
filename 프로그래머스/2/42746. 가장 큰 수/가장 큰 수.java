import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        // 문자열로 바꾸어서 정렬하기?? 다만, 해당 숫자는 그대로 유지
        String[] s = new String[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            s[i]=Integer.toString(numbers[i]);
        }
        // 양수쪽으로 배열 정렬
        Arrays.sort(s, (o1,o2)->(o2+o1).compareTo(o1+o2));
        
        if (s[0].charAt(0)=='0') return "0";
        for (int i=0; i<s.length; i++) {
            sb.append(s[i]);
        }
        String answer = sb.toString();
        
        return answer;
    }
}