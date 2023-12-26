//각 음식은 짝수개로 먹어야함. 앞뒤로 작은거부터 먹도록 해야함
class Solution {
    public String solution(int[] food) {
        String answer = "";
        for (int i=1; i<food.length; i++) {
            for (int j=0; j<food[i]/2; j++) {
                answer+=i;
            }
        }
        answer+='0';
        for (int i=food.length-1; i>=1; i--) {
            for (int j=0; j<food[i]/2; j++) {
                answer+=i;
            }
        }
        
        return answer;
    }
}