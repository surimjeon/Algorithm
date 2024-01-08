// 노란색과 갈색 수는 기억 => 가로,세로 크기
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        //[2,1] / 1 2 4+2 6+2 12 24 
        //두개 더한 것들 중에 나눠떨어지는 것 1,2,3,4,6,8... 4,6 / 48
        
        for (int i=1; i*i<=yellow; i++) {
            if (yellow%i==0) {
                int div = yellow/i;
                if ((div+2)*(i+2) == brown+yellow) {
                    answer=new int[]{div+2, i+2};
                    break;}
            }
        }
        
        return answer;
    }
}