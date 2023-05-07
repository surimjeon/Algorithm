import java.io.*;

import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken());
		int m =Integer.parseInt(st.nextToken());
		
		HashSet<String> set = new HashSet<String>();
		for (int i=0; i<n; i++) {
			set.add(br.readLine());
		}
		int cnt=0;
		for (int j=0; j<m; j++) {
			String temp=br.readLine();
			if (set.contains(temp)) {
				cnt+=1;
			}
		}
		System.out.println(cnt);
		
	}
}