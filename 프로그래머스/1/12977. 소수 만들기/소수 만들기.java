//3개의 수를 더했을 때, 소수가 되는 경우의 개수
//3개를 골랐을 때 나오는 모든 경우의 수를 구하고, 이를 소수인지 판별하기 
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 에라토스테네스 체 이용해서 소수 판별 (최대 3000까지)
        for (int i=0; i<nums.length-2; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    if (chea(nums[i]+nums[j]+nums[k])) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
    
    public static boolean chea(int num) {
        if (num<2) return false;
        else {
            for (int i=2; i*i<=num; i++) {
                if (num%i==0) {
                    return false;
                }
            }
        }
        return true;
    }
}