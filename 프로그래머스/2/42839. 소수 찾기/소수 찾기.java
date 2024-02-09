//소수 몇개 만들 수 있는지
import java.util.*;
class Solution {
    static HashSet<Integer> set = new HashSet<>();
    static boolean[] visited = new boolean[7]; //문자열의 각 문자를 방문했는지
    public int solution(String numbers) {
        int answer = 0;
        //숫자의 모든 조합 해보기(dfs??? )
        dfs("", numbers);
        
        Iterator<Integer> iter = set.iterator();
        
        while (iter.hasNext()) {
            int num = iter.next();
            if (isprime(num)) {
                answer++;
            }
        }
        return answer;
    }
    public void dfs(String temp, String numbers) {
       for (int i=0; i<numbers.length(); i++) {
           if (!visited[i]) {
               visited[i]=true;
               set.add(Integer.parseInt(temp+numbers.charAt(i)));
               dfs(temp+numbers.charAt(i), numbers);
               visited[i]=false;
           }
       }
    }    
    // 소수판별 알고리즘
    public boolean isprime(int num) {
        if (num==1 || num==0) {
            return false;
        }
        for (int i=2; i<=(int)Math.sqrt(num); i++) {
            if (num%i==0) return false;
        }
        return true;
    }
}