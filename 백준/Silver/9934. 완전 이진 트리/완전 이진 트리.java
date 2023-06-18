

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		Queue<Node> q = new LinkedList<>();
		int num = (int)Math.pow(2, k)-1;
		int [] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<num; i++) {
			 arr[i] = Integer.parseInt(st.nextToken());
		}
		
		q.add(new Node(0,num-1));
		
		while (!q.isEmpty()) {
			int qsize=q.size();
			for (int i=0; i<qsize; i++) { //현재 들어있는 사이즈(계층의 수)만큼 
				Node now = q.poll();
				
				int cen = (now.left + now.right)/2;
				
				System.out.print(arr[cen]+" ");
				
				if(now.left!=now.right) { //왼쪽과 오른쪽이 같지 않으면(=마지막 계층이면 add하지 않음)
					q.add(new Node(now.left, cen-1));
					q.add(new Node(cen+1, now.right));
				}
			}
			System.out.println();
			
		}
		
		
	}
	public static class Node {
		int left;
		int right;
		
		Node(int left, int right) { //변수값 저장
			this.left=left;
			this.right=right;
		}
	}
}
