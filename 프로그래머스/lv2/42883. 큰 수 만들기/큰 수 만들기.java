class Solution {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int idx=0;
        //전체 자리 수에서 - k인 만큼의 숫자를 반환할 필요가 있음
        for (int i=0; i<number.length()-k; i++) { //0~6
            int mx =0;
            for(int j=idx; j<=i+k; j++) {
                if (mx<number.charAt(j)-'0') {
                    mx=number.charAt(j)-'0';
                    idx=j+1;
                }
                
            }
            sb.append(mx);
        }
        
        
        
        return sb.toString();
    }
}