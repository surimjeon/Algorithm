
import java.io.*;
import java.util.*;

public class Main {
	static int n,m,t, end_x, end_y;
	static int[][] mapp;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//T시간 이내로 용사를 만나야함, 1칸 1시간
		//그람을 얻으면 벽 부술 수 있음
		//검을 얻었을 떄와 얻지 않았을 떄, 2가지 경우? bfs로 거리 탐색
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		
		mapp = new int[n][m];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for (int j=0; j<m; j++) {
				mapp[i][j]=Integer.parseInt(st1.nextToken());
			}
		}
		
		int ans = bfs(0,0,0); //시작 지점
		int gum_ans = gum(0,0,0);
		int mn = Math.min(ans, gum_ans);
		
		if(t<mn) System.out.println("Fail");
		else System.out.println(mn);
	}
	public static int bfs(int i, int j, int cnt) {
		int[][] visited= new int[n][m];
		Queue<int []> q = new LinkedList<>();
		visited[i][j]=1;
		q.add(new int[]{i,j,cnt});
		
		while (!q.isEmpty()) {
			int[] temp = q.poll();
			int x =temp[0];
			int y =temp[1];
			int cnt_ans = temp[2];
			if (x==n-1 && y==m-1) {
				return cnt_ans;
			}
			for (int k=0; k<4; k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
				
				if (nx>=0 && nx<n &&ny>=0 && ny<m) {
					if (visited[nx][ny]==0 && mapp[nx][ny]!=1) {
						visited[nx][ny]=1;
						q.add(new int[] {nx,ny,cnt_ans+1});
					}
				}
			}
		}
		return t+1; //만약 도착하지 못하면 t보다 1개 더 큰수를 더하기
	}
	
	public static int gum(int i, int j, int cnt) {
		int[][] visited= new int[n][m];
		Queue<int []> q = new LinkedList<>();
		visited[i][j]=1;
		
		for (int end_i=0; end_i<n; end_i++) {
			for (int end_j=0; end_j<m; end_j++) {
				if (mapp[end_i][end_j]==2) {
					end_x = end_i;
					end_y = end_j;
				}
			}
		}
		q.add(new int[]{i,j,cnt});
		
		while (!q.isEmpty()) {
			int[] temp = q.poll();
			int x =temp[0];
			int y =temp[1];
			int ans_cnt = temp[2];
			if (x==end_x && y==end_y) {
				return ans_cnt+(n-1-end_x)+(m-1-end_y);
			}
			for (int k=0; k<4; k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
				
				
				if (nx>=0 && nx<n &&ny>=0 && ny<m) {
					if (visited[nx][ny]==0 && mapp[nx][ny]!=1) {
						visited[nx][ny]=1;
						q.add(new int[] {nx,ny, ans_cnt+1});
					}
				}
			}
		}
		return t+1; //만약 도착하지 못하면 t보다 1개 더 큰수를 더하기
	}
}



