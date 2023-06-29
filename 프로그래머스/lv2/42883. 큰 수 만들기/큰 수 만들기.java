class Solution {
    public String solution(String number, int k) {
        String answer = "";
        // 제일 앞수가 크면 가장 큰거...?  그러고 나서 k를 못채우면, 다음 자리수를 제거
        int idx =0; //시작위치는 최대값 위치부터
        StringBuilder st = new StringBuilder();
        
        for (int i=0; i<number.length()-k; i++) { //6자리 만들기
            int mx = 0;
            for (int j=idx; j<=i+k; j++) { //범위의 시작~k자리만큼 끊으면서 큰수비교
                int temp = number.charAt(j)-'0';
                if (mx<temp) {
                    mx = temp;
                    idx = j+1;
                }
            }
            st.append(mx);
        }
        
            
        return st.toString();
    }
}