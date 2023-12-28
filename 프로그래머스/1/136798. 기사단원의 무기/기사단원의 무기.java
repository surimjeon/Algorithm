// 약수 개수 = 공격력, 만약 제한수치를 넘어가면 정한 공격력을 따라야함
// number이하 숫자의 모두 약수 구하기 -> 만약 제한수치 넘으면, 정한 공격력
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i=1; i<=number; i++) {
            int cnt = div(i); //그 숫자의 약수개수 구하기
            if (cnt > limit) cnt = power;
            answer+=cnt;
        }
        
        return answer;
    }
    public static int div(int num) {
        int cnt =0;
        if (num==1) return 1;
        for (int i=1; i*i<=num; i++) {
            if (num==i*i) cnt++;
            else if (num%i==0) cnt+=2;
        }
        return cnt;
    }
}