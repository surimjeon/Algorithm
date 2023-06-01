
import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// 1일차를 포함했을 떄, 2일차를 포함했을 떄, 뒤에 나오는 것들 탐색...
		int[] t = new int [n];
		int[] p = new int [n];
		int[] dp = new int[n+1]; //지금까지 계산할 값
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			t[i]= Integer.parseInt(st.nextToken());
			p[i]= Integer.parseInt(st.nextToken());
		}
		
		int mx = 0;
		
		for (int i=0; i<n; i++) {
			//다음 idx
			int idx = i+t[i];
			if (idx<=n) {
				dp[idx]= Math.max(dp[idx], dp[i]+p[i]); }
				//범위에 벗어나지 않으면, 원래 저장되어있는 dp와 이전에 누적한 값 중 큰 값을 집어넣는다
				dp[i+1] = Math.max(dp[i+1], dp[i]);
				//상담은 계속 이어지기 때문에, 이전값(dp[i])을 dp[i+1]에 대입한다.
		}
		System.out.println(dp[n]);
		
	}
}

