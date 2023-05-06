
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//n장의 카드 중 3장을 골라서 숫자 m을 넘지 않으면서 m과 최대한 가깝게 만들기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] card = new int[n];
		int mx=0;
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			card[i]=Integer.parseInt(st1.nextToken());
		}
		
		for (int i=0; i<n-2; i++) {
			for (int j=i+1; j<n-1; j++) {
				for (int k=j+1; k<n; k++) {
					int sm = card[i]+card[j]+card[k];
					if (sm==m){
						mx=sm;
						break;
					}
					if (sm<m && sm>mx) {
						mx=sm;
					}
				}
			}
		}
		System.out.println(mx);
	}
}