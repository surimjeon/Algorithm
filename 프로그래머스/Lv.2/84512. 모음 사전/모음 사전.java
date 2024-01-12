// dfs로 어떻게 풀지..? 
import java.util.*;
class Solution {
    static List<String> list;
    static char[] moem = new char[] {'A','E','I','O','U'};
    public int solution(String word) {
        list = new ArrayList<>();
        dfs("", 0);
        
        int answer =0;
        for (int i=0; i<list.size(); i++) {
            if (word.equals(list.get(i))) {
                answer=i;
                break;
            }
        }
        return answer;
    }
    public static void dfs(String s, int idx) {
        list.add(s);
        
        if (idx==5) return;
        for (int i=0; i<5; i++) {
            dfs(s+moem[i], idx+1);
        }
        
    }
    
}