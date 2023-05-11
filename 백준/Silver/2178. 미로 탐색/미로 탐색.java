

import java.io.*;
import java.util.*;

public class Main {
	static int [][] arr;
	static int [][] visited;
	static int n,m;
	
	
	
	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		int[] dx = new int[] {-1,0,1,0};
		int[] dy = new int[] {0,-1,0,1};
		q.add(new int[] {x,y}); //큐에 배열을 넣는 방법->q의 타입을 배열로 정의하고, 객체만들 때 x,y를 넣어주기

		visited[x][y]=1;
		
		while(!q.isEmpty()) {
			int[] temp = q.poll();
			int i = temp[0];
			int j =temp[1];
//			if (i==n-1 && j==m-1) {
//				break;
//			}
			
			for (int k=0; k<4; k++) {
				int nx = i+dx[k];
				int ny = j+dy[k];
				if (nx>=0 && nx<n && ny>=0 && ny<m) { //방문안했고, 1(길이 있으면)
					if (visited[nx][ny]==0 && arr[nx][ny]==1) {
						visited[nx][ny]=visited[i][j]+1;
						q.add(new int[] {nx,ny});
					}
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nm = br.readLine();
		n =Integer.parseInt(nm.split(" ")[0]);
		m =Integer.parseInt(nm.split(" ")[1]);
		arr= new int [n][m];
		visited= new int[n][m]; 
		for (int i=0; i<n; i++) {
			String temp=br.readLine();
			for (int j=0; j<m; j++) {
				arr[i][j]=temp.charAt(j)-'0';
			}
		}
		bfs(0,0);
		System.out.println(visited[n-1][m-1]);
	}
}



	