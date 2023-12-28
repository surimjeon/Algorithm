//3개의 수를 더했을 때, 소수가 되는 경우의 개수
//3개를 골랐을 때 나오는 모든 경우의 수를 구하고, 이를 소수인지 판별하기 
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean[] prime = new boolean[3001];
        // 에라토스테네스 체 이용해서 소수 판별 (최대 3000까지)
        chea(prime);
        for (int i=0; i<nums.length-2; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    if (!prime[nums[i]+nums[j]+nums[k]]) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
    public static void chea(boolean[] prime) {
        for (int i=2; i*i<=3000; i++) {
            for (int j=i; i*j<=3000; j++) {
                prime[j*i]=true;
            }
        }
    }
}