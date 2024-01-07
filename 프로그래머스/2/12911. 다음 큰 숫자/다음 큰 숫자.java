//n보다 큰 자연수 + 2진수 변환 시 1의 개수가 같음
class Solution {
    public int solution(int n) {
        int answer = 0;
        String binary = Integer.toBinaryString(n);
        
        int cnt =0; 
        for (int i=0; i<binary.length(); i++) {
            if (binary.charAt(i)=='1') cnt++;
        }
        
        
        for (int i=n+1; i<=1000000; i++) {
            String compare = Integer.toBinaryString(i);
            int com_cnt=0;
            for (int j=0; j<compare.length(); j++) {
                if (compare.charAt(j)=='1') com_cnt++;
            }
            
            if (cnt==com_cnt) {
                answer=i;
                break; 
            }
        }
        return answer;
    }
}