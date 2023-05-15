

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n =Integer.parseInt(br.readLine());
		//우선순위 큐로 힙 구현하기(최대힙은 내림차순=reverse해주기)
		PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());;
		
		for(int i=0; i<n; i++) {
			int x =Integer.parseInt(br.readLine());
			if(x>0) {
				maxheap.add(x);
			}
			else if (x==0) {
				if (maxheap.isEmpty()) {
					sb.append(0).append("\n");
				}
				else {
					sb.append(maxheap.poll()).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}