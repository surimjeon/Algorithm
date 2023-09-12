import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
        static StringTokenizer st;
        static int[] stair;
        static Integer[] dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 계단을 밟 + 다음 or 담담계단 오를 수 있음
        // 연속된 3개는 밟으면x
        // 마지막 계단은 반드시 밟아야 함(뒤에서부터 밟기)
        //최댓값 구하기 - 앞 계단을 밟는 경우, 그 앞앞을 밟는 경우
        int n = Integer.parseInt(br.readLine());
        stair = new int[n+1];
        dp = new Integer[n+1];

        for (int i=1; i<=n; i++) {
            stair[i]=Integer.parseInt(br.readLine());
        }

        dp[0]=stair[0];
        dp[1]=stair[1];

        if(n>=2) {
            dp[2]=stair[2]+stair[1]; //1+2층 합친거
        }

        int ans =dfs(n);
        System.out.println(ans);


        }
        public static int dfs(int n) {

            if(dp[n]==null) {
                dp[n]=Math.max(dfs(n-3)+stair[n-1], dfs(n-2))+stair[n];
            }

            return dp[n];
        }
    }

