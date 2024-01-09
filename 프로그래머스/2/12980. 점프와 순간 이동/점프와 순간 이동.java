import java.util.*;
// K칸 점프 = 사용량(최소화), 순간이동(현재까지 온 거리*2)
// n은 가야할 거리, k칸 : 건전지 사용량
public class Solution {
    public int solution(int n) {
        int ans = 0;
        while (n>0) {
            if (n%2==1) {
            n--;
            ans++;
            }
            else {
                n=n/2;
            }
        }
        
        return ans;
    }
}