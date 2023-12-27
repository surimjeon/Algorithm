// 어느 하나라도 벽이면 전체 지도에서도 벽 / 모두 공백 = 공백 
//정사각형 한변 크기 n 
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i=0; i<n; i++) {
            String ans = "";
            // String format은 문자열 형태로 바꿔주는 것(%%%ds는 width가 n인 d(정수)형태로 변환 = String.format(%d, 비트 OR 연산수행한 결과))
            String first = String.format(String.format("%%%ds",n), Integer.toBinaryString(arr1[i]));
            String second =String.format(String.format("%%%ds",n), Integer.toBinaryString(arr2[i]));
            
            for (int j=0; j<n; j++) {
                if (first.charAt(j)=='1' || second.charAt(j)=='1') ans+="#";
                else ans+=" ";
            }
            answer[i]=ans;
        }
        return answer;
    }
}