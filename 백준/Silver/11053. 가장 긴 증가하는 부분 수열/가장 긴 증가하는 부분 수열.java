import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //가장 긴 증가하는 부분 수열(개수가 많음) - 왜 dp?? 점화식..
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        for (int i=0; i<n; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<n; i++) {
            dp[i]=1;
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++) {
                if (arr[j]<arr[i]) dp[i]=Math.max(dp[i], dp[j]+1);
                //현재 들어있는 dp[i]랑, 새롭게 dp[j]+1이랑 비교하기
            }
        }

        int mx = 0;
        for (int i=0; i<n; i++) {
            mx = Math.max(mx,dp[i]);
        }

        System.out.println(mx);
    }

}