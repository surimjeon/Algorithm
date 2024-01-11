// 빈칸을 숫자로 채움(i행 i열까지 )=>행을 하나로 붙임 left~right까지만 남김
class Solution {
    public int[] solution(int n, long left, long right) {
        
        int[] answer = new int[(int)(right-left)+1];
        
        //123 (1,1), 
        //223
        //333
        
        for (int i=0; i<answer.length; i++) {
            int y = (int)(left/n+1); //몫=행 (대상의 수를 ,,,right가 되기 전까지)
            int x = (int)(left%n+1);
            left++;
            answer[i]=Math.max(y,x);
        }
        
        
        return answer;
    }
}