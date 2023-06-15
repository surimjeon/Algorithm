

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//색종이에 들어있는 값만큼 다음 풍선을 터트림
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		ArrayDeque<int[]> q = new ArrayDeque<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=1;i<n+1; i++) {
			int[] arr = {Integer.parseInt(st.nextToken()), i};
			q.offer(arr);
		}
		
		int[] temp = q.poll();
		sb.append(temp[1]+" ");
		
		while (!q.isEmpty()) {
			if (temp[0]<0) {
				for(int i=1; i<-temp[0]; i++) {
					q.addFirst(q.pollLast());
				}		
				temp=q.pollLast();
				sb.append(temp[1]+" ");
			}
			else {
				for(int i=1; i<temp[0]; i++) {
					q.add(q.poll());
			}
			temp=q.poll();
			sb.append(temp[1]+" ");
			
			}
			
		}
		System.out.println(sb);
		
	}

}



