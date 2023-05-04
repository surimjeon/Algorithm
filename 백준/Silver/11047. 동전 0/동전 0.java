

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n= Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int[] coin=new int[n]; 
		
		int sum=k;
		int cnt=0;
		for(int i=0; i<n; i++) {
			int A = Integer.parseInt(br.readLine());
			coin[i]=A;
		}
		
		for(int j=n-1;j>=0; j--) {
			if (coin[j]<=sum) {
				cnt+=sum/coin[j];
				sum=sum-((sum/coin[j])*coin[j]);	
				if (sum==0) {
					break;
				}
			}
		}
		System.out.println(cnt);
		
	}
}



	