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
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        for (int i=0; i<n; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        //증가했다가 감소하거나/ 감소만하거나/증가만하면 => 수열
        //가장 긴 수열의 길이
        //해당 배열을 기준으로, 왼쪽은 증가하는지, 오른쪽은 감소하는지
        for (int i=0; i<n; i++){
            dp1[i]=1;
            dp2[i]=1;
        }

        for (int i=1; i<n; i++) {
            for (int j=0; j<i; j++) {
                if (arr[i]>arr[j]) dp1[i] = Math.max(dp1[i], dp1[j]+1);
            }
        }
        for (int i=n-2; i>=0; i--) {
            for (int j=i+1; j<n; j++) {
                if (arr[i]>arr[j]) {
                    dp2[i] = Math.max(dp2[i], dp2[j]+1);
                }
            }
        }


        int mx = 0;
        for (int i=0; i<n; i++) {
            mx = Math.max(dp1[i]+dp2[i]-1, mx);
        }
        System.out.println(mx);
    }

}