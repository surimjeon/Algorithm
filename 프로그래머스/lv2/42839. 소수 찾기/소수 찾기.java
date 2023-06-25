import java.util.*;
class Solution {
    static int answer=0;
    static HashSet<Integer> hash = new HashSet<>(); //중복안되도록
    public int solution(String numbers) {
        int answer = 0;
        whatcnt("",numbers);
        
        //set은 전체를 반복하는 Iterator를 이용해서 출력해야함
        Iterator<Integer> iter = hash.iterator();
        
        while (iter.hasNext()) {
            int n = iter.next();
            if (isprime(n)) {
                answer++;
            }
        }
        
        return answer;
    }
    public static void whatcnt(String num, String numbers) {
        //현재 조합을 set에 추가하기(""은 에러이기 때문에 제외)
        if (!num.equals("")) {
            hash.add(Integer.parseInt(num));
        }
        for (int i=0; i<numbers.length(); i++) {
            whatcnt(num+numbers.charAt(i), numbers.substring(0,i)+numbers.substring(i+1));
        }
    }
    
    
    public static boolean isprime(int num) {
        boolean flag = true;
        if (num==0||num==1) {
            return false;
        }
        for (int i=2; i<=Math.sqrt(num); i++) {//나눌 수가 1과 자기자신밖에 없음
            if (num%i==0) return false;
        }
        return flag;
    }
}