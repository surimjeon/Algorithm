import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] str = br.readLine().split(" ");
		for (int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		int mn=Integer.MAX_VALUE;
		int mx=Integer.MIN_VALUE;
		for (int j=0; j<n; j++) {
			mx=Math.max(mx, arr[j]);
			mn=Math.min(mn, arr[j]);
		}
		
		sb.append(mn).append(" ").append(mx);
		
		System.out.println(sb);
		
	}
}