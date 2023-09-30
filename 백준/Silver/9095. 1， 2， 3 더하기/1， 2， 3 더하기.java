import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //상근이가 먼저 시작
        //n개의 돌, 마지막돌 누가 이김??
        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] dp = new int[12];
            dp[0]=1;
            dp[1]=1;
            dp[2]=2;

            for (int j=3; j<=n; j++) {
                dp[j]= dp[j-3]+dp[j-2]+dp[j-1];
            }
            System.out.println(dp[n]);

        }

    }

}
