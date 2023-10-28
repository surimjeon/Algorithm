import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int mx=1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //연속해서 커지거나 작아지는 것중 길이가 가장 긴것
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[n][2];


        dp[0][0]=1;
        dp[0][1]=1;

        for (int i = 1; i < n; i++) {

            if (arr[i - 1] < arr[i]) {
                dp[i][0] = dp[i-1][0] + 1;
                dp[i][1] = 1;
            }

            else if (arr[i - 1] > arr[i]) {
                dp[i][0] = 1;
                dp[i][1] = dp[i - 1][1] + 1;
            }

            else {
                dp[i][0] = dp[i - 1][0] + 1;
                dp[i][1] = dp[i - 1][1] + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, Math.max(dp[i][0], dp[i][1]));
        }

        System.out.println(mx);
    }

}
