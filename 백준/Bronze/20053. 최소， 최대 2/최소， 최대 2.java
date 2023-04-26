

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int tc=0; tc<T; tc++) {
//			int mn=Integer.MIN_VALUE;
			int n = Integer.parseInt(br.readLine());
			String[] txt = br.readLine().split(" ");
			int mn=Integer.parseInt(txt[0]);
			int mx=Integer.parseInt(txt[0]);
			
			for (int i=1; i<n; i++) {
				mn=Math.min(mn, Integer.parseInt(txt[i]));
				mx=Math.max(mx, Integer.parseInt(txt[i]));
			}
			System.out.println(mn+" "+mx);
		}
	
	
	}
}
	