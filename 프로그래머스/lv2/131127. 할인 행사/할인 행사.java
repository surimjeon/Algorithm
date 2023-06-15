class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        //10일 동안 회원 자격, 할인 가능한 날짜가 있는 횟수 세리기
       //0부터 discount의 개수 - 10까지 돌면서 문자열과 일치하면 그 인덱스의 number배열의 -1, 만약에 number에 0이 아닌 다른 양수가 있다면 0, 모두 0이라면 answer+1
        for (int i=0; i<discount.length-9; i++) {
            int k;
            for (k=0; k<want.length; k++) {
                int check=0;
                for (int j=i; j<i+10; j++) {
                    if (discount[j].equals(want[k])) {
                       check++;
                    }
                }
               if(check<number[k]) {
                     break; //break걸리지 않았으면
                }
            }
            if (k==want.length) {
                answer++;
            }
        }
    
        return answer;
    }
}