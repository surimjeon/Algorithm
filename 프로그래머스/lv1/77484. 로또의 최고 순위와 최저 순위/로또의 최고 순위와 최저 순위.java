class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int[] check = new int[46];
        for (int i=0; i<lottos.length; i++) {
            check[lottos[i]]++;
        }
        
        
        int min = 0;
            for (int j=0; j<win_nums.length; j++) {
                if (check[win_nums[j]]!=0){
                    min++;
                }
            }
        answer[0]=rank(min+check[0]);
        answer[1]=rank(min);
        
        return answer;
    }
    public static int rank(int num) {
        int ranking=0;
        switch(num) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
       
    }
}