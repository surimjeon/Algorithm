import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        //dp에서 index에 값을 담는 것이 아닌, 앞에서부터 차례로 합을 저장하면서
        //뒤의 수가 더 크다면(=증가한다면), 그 수가 더큰지, 아님 map의 값을 더한 값이 더 큰지 비교
        int[] dp = new int[n+1];

        st= new StringTokenizer(br.readLine());
        int[] lst = new int[n+1];
        for (int i=1; i<n+1; i++) {
            lst[i]=Integer.parseInt(st.nextToken());
        }

        dp[1]=lst[1];
        int mx =dp[1];
        for (int i=2; i<=n; i++) {
            dp[i]=lst[i];

            for(int j=1; j<i; j++) {
                if (lst[j]<lst[i]) {
                    dp[i]=Math.max(dp[i], dp[j]+lst[i]);
                }
            }
            mx = Math.max(mx,dp[i]);
        }

        System.out.println(mx);

    }

}
