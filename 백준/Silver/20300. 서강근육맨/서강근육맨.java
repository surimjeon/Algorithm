
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		
		Arrays.sort(arr);

		
		long mn = Integer.MIN_VALUE;
		
		if (n%2==0) {
			for (int i=0; i<=n/2; i++) {
				if (arr[i]+arr[n-1-i]>mn) {
					mn = arr[i]+arr[n-1-i];
				}
			}
		}
		else {
//			if (n==1) {
//				mn = arr[0];
//			}
			for (int i=0; i<n/2; i++) {
				if (arr[i]+arr[n-2-i]>mn) {
					mn = arr[i]+arr[n-2-i];
				}
			}
		}
		
		System.out.println(mn);
	}

}
