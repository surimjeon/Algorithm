import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String a = Integer.toString(n, k);
        StringTokenizer st = new StringTokenizer(a,"0");
        List<String> lst = new ArrayList<>();
        
        while (st.hasMoreTokens()) {
            lst.add(st.nextToken());
        }
        //0을 기준으로 토큰 자르기
        for (int i=0; i<lst.size(); i++) {
            if(prime(Long.parseLong(lst.get(i)))) {
                answer++;
            }
            //n은 100만이상이라서 int로 하면 에러가 남
        }
        
        return answer;
    }
    
    public static boolean prime(Long n_num) {
        if (n_num<2) {
            return false;
        }
        else {
            for (int i=2; i<=(int)Math.sqrt(n_num); i++) {
                if (n_num%i==0) {
                    return false; 
                }
            }
            return true;
        }
    }
}