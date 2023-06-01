

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// 1일차를 포함했을 떄, 2일차를 포함했을 떄, 뒤에 나오는 것들 탐색...
		int[] t = new int [n+15];
		int[] p = new int [n+15];
		int[] dp = new int[n+15]; //지금까지 계산할 값
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			t[i]= Integer.parseInt(st.nextToken());
			p[i]= Integer.parseInt(st.nextToken());
		}
		
		int mx = 0;
		
		for (int i=0; i<=n; i++) {
			//다음 idx
			int idx = i+t[i];
			dp[i]=Math.max(dp[i],mx); //dp[i]정의
			
			dp[idx]= Math.max(dp[idx], dp[i]+p[i]); 
			//이전에 더한 값들과 현재 값 중 max값을 지정
			mx = Math.max(mx, dp[i]);
			//mx값 갱신
		}
		System.out.println(mx);
		
	}
}

