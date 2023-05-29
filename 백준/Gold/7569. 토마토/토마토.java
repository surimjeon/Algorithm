
import java.io.*;
import java.util.*;

public class Main {
	static int m,n,h; //행열
	static int[][][] arr, visited;
	
	public static void bfs() {
		int [] dx = new int[] {-1,0,1,0,0,0};
		int [] dy = new int[] {0,-1,0,1,0,0};
		int [] dz = new int[] {0,0,0,0,1,-1};
		Queue<int[]> q = new LinkedList<>();
		// 탐색하기 = 큐에 모든 점 넣은 다음에 4방으로 탐색할 수 있도록?
		for (int k=0; k<h; k++) {
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					if (arr[i][j][k]==1) {
						q.add(new int[] {i,j,k});
						visited[i][j][k]=1;
					}
				}
			}
		}
		
		while (!q.isEmpty()) {
			int[] temp = q.poll();
			
			int x=temp[0]; //여러개를 넣고 그 중에 0번째는 x,
			int y=temp[1];
			int z = temp[2];

			for (int k=0; k<6; k++) {
				int nx = x+ dx[k];
				int ny = y + dy[k];
				int nz = z + dz[k];
				
				if (nx>=0 && nx<n && ny>=0 && ny<m && nz>=0 && nz<h ) {
					if (visited[nx][ny][nz]==0 && arr[nx][ny][nz]==0) {
						q.add(new int[] {nx, ny, nz});
						visited[nx][ny][nz]=1;
						arr[nx][ny][nz]=arr[x][y][z]+1;
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
		h = Integer.parseInt(st.nextToken());
		arr = new int[n][m][h];
		visited = new int[n][m][h];
		
		
		for (int k=0; k<h; k++) {
			for (int i=0; i<n; i++) {
				StringTokenizer st1 = new StringTokenizer(br.readLine());
				for (int j=0; j<m; j++) {
					arr[i][j][k]=Integer.parseInt(st1.nextToken()); 
				}
			}
		}
		
		
		
		
		bfs();
		
		

		int mx = Integer.MIN_VALUE;
		boolean flag = false;
		for (int k=0; k<h; k++) {
			for (int i=0; i<n; i++) {
				if (flag) {
				break;
			}
				for (int j=0; j<m; j++) {
					if (mx < arr[i][j][k]) {
						mx = arr[i][j][k]-1;
					}
					if (arr[i][j][k]==0) {
						mx =-1;
						flag=true;
						break;
					}			
				}
			}
		}
		System.out.println(mx);
	}	
}