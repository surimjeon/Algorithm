
import java.io.*;
import java.util.*;

public class Main {
	static int m,n; //행열
	static int[][] arr, visited;
	// 토마토는 4방에서 근처에 있으면 익음
	
	public static void bfs() {
		int [] dx = new int[] {-1,0,1,0};
		int [] dy = new int[] {0,-1,0,1};
		Queue<int[]> q = new LinkedList<>();
		// 탐색하기 = 큐에 모든 점 넣은 다음에 4방으로 탐색할 수 있도록?
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (arr[i][j]==1) {
					q.add(new int[] {i,j});
					visited[i][j]=1;
				}
			}
		}
		while (!q.isEmpty()) {
			int[] temp = q.poll();
			
			int x=temp[0]; //여러개를 넣고 그 중에 0번째는 x,
			int y=temp[1];

			for (int k=0; k<4; k++) {
				int nx = x+ dx[k];
				int ny = y + dy[k];
				
				if (nx>=0 && nx<n && ny>=0 && ny<m) {
					if (visited[nx][ny]==0 && arr[nx][ny]==0) {
						q.add(new int[] {nx, ny});
						visited[nx][ny]=1;
						arr[nx][ny]=arr[x][y]+1;
					}
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		m= Integer.parseInt(st.nextToken()); //가로칸 
		n= Integer.parseInt(st.nextToken()); //세로칸 수
		arr = new int[n][m];
		visited = new int[n][m];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for (int j=0; j<m; j++) {
				arr[i][j]=Integer.parseInt(st1.nextToken());
				//1이면, queue에 담기!! 
			}
		}
	
		
		bfs();
		
		
		int mx = Integer.MIN_VALUE;
		for (int i=0; i<n; i++) {
			if (mx==-1) {
				break;
			}
			for (int j=0; j<m; j++) {
				if (mx < arr[i][j]) {
					mx = arr[i][j]-1;
				}
				if (arr[i][j]==0) {
					mx =-1;
					break;
				}
				
			}
		}
		System.out.println(mx);
	}	
}