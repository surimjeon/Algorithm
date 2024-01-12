import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        // 어떤번호가 다른 번호의 접두어??
        Arrays.sort(phone_book);
        
        for (int i=0; i<phone_book.length-1; i++) {
            String s = phone_book[i];
            if (phone_book[i+1].startsWith(s)) {
                answer=false;
                break;
            }
        }
        return answer;
    }
}