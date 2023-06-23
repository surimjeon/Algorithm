import java.util.*;
class Solution {
    static char[] al;
    static List<String> lst;
    public int solution(String word) {
        al = new char[] {'A','E','I','O','U'};
        //하나하나 리스트에 경우의 수를 모두 넣고, 모든 경우의 수를 구한 후
        //word와 같으면 cnt 반환
        int answer=0;
        lst = new ArrayList<>();
        
        dfs("", 0);
        
        for (int i=0; i<lst.size(); i++) {
            if (lst.get(i).equals(word)) {
                answer=i;
                break;
            }
        }
       
        return answer;
    }
    public static void dfs(String now, int depth) { //끝자리까지 가는지
        lst.add(now); //모든 경우의 수 리스트화
        
        if (depth==5) return;
        
        for (int i=0; i<al.length; i++) {
            dfs(now+al[i], depth+1); //각 알파벳별로 갯수를 늘려가면서 만들기
        }
        
    }
    
    
}