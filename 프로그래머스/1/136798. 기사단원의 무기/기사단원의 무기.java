// 약수개수보다 초과하면, 지정된 양(limit)만큼 무기를 만들어야함 => 
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        //약수의 수 구하기
        // limit넘어가면 power로 바뀌어야함
        for (int i=1; i<=number; i++) {
            int cnt =0;
            for (int j=1; j*j<=i; j++) {
                if (j*j==i) cnt++;
                else if (i%j==0) cnt+=2;
            }
            if (cnt>limit) answer+=power;
            else answer+=cnt;
        }
        return answer;
    }
}