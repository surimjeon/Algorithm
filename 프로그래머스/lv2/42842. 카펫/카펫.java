class Solution {
    public int[] solution(int brown, int yellow) {
        // 두개 더한 것을 모든 나눠지는 경우의 수를 찾고,
        //그들 중에 가로 - 2 * 세로 -2 가 yellow와 같은 것.. 구하기
        
        // ArrayList<int[]> arr = new ArrayList<>();
        int total = brown+yellow;
        int width = 0;
        int height = 0;
        
        for (int i=1; i< total; i++){
            if (total%i==0) {
                int j = total/i;
                if ((j-2)*(i-2)==yellow) {
                    width=i;
                    height=j;
                }
            }
        }
        
        int[] answer = {width, height};
        return answer;
    }
}