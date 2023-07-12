class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        //2,5,8,0은 가까운 거리 위주로 왼,오 결정
        //거리이동은 (기존 수- 현재 수)/3의 몫과 나머지를 더한 값
        int left=10; 
        int right=12;
        for (int i=0; i<numbers.length; i++) {
            int num = numbers[i];
            
            if (num==1 || num==4 || num==7) {
                answer+="L";
                left = num;
            }
            else if (num==3 || num==6 || num==9) {
                answer+="R";
                right = num;
            }
            else { //0은 11, *는 10, #는 12로 보는게 맞지 않을까...? 
                if(num==2 || num==5 || num==8 || num==0) {
                    if (num==0) {
                        num=11;
                    }
                    int leftdis = (Math.abs(num-left)/3) + (Math.abs(num-left)%3);
                    int rightdis = (Math.abs(num-right)/3) + (Math.abs(num-right)%3);
                    if (leftdis < rightdis) {
                        answer+="L";
                        left = num;
                    }
                    else if (leftdis > rightdis) {
                        answer+="R";
                        right = num;
                    }
                    else {
                        if (hand.equals("right")) {
                            answer+="R";
                            right = num;
                        }
                        else {
                            answer+="L";
                            left = num;
                        }
                    }
                }
            }
            
        }
        return answer;
    }
}