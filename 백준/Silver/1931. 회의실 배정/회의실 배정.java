

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 시작, 도착 횟수
		// 어떤 일을 시작하기 위해서는 끝이 빨리 끝나야한다(도착시간을 기준으로 한다)
		
		int n =  Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());	
		}
		Arrays.sort(arr, (o1,o2) -> o1[1]==o2[1] ? o1[0]-o2[0]: o1[1]-o2[1]);
		
		int prev_end = 0;
		int cnt =0;
		for (int i=0; i<n; i++) {
			if (arr[i][0] >= prev_end ) {
				prev_end = arr[i][1];
				cnt+=1;
			}
		}
		System.out.println(cnt);
	}
}

