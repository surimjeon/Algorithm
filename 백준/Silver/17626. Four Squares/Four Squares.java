import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static Integer[] dp;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n+1만큼해서 pow를 배열에 저장
        // 1 4 9 ...
        //dp에 그 횟수 적어놓기
        int n = Integer.parseInt(br.readLine());

        dp = new Integer[n+1];

        dp[0]=0;
        dp[1]=1;

        f(n);

        System.out.println(dp[n]);

    }
    //dp[num]에 최소의 제곱수 개수를 저장하기
    public static void f(int num) {
        for (int i=2; i<=num; i++) {
            int mn = Integer.MAX_VALUE;
            for (int j=1; j*j<=i; j++) {
                mn=Math.min(dp[i-j*j], mn);
            }
            dp[i]=mn+1;
        }
    }
}
