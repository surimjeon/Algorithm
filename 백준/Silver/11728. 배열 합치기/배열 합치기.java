import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr = new ArrayList<>();
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());

		for (int i=0; i<n; i++) {
			arr.add(Integer.parseInt(st1.nextToken()));
		}
		for (int j=0;j<m;j++) {
			arr.add(Integer.parseInt(st2.nextToken()));
		}
		
		Collections.sort(arr);
		for (Integer i : arr) {
			sb.append(i).append(" ");
		}
		System.out.println(sb);
	}
}