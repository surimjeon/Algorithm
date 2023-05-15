
import java.io.*;
import java.util.*;

public class Main {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int mn= Integer.MAX_VALUE;
	static int n;
	static int[][] mapp, visited;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 씨앗을 심고 1년 후 꽃이 핌, 씨앗 3개(4방으로 꽃핌)
		//다른 꽃잎(혹은 꽃술)과 닿게 될 경우 두 꽃 모두 죽고
		//화단 밖으로 꽃잎이 나가게 된다면 그 꽃은 죽어버리고 만다.
		//가장 싼 가격에 세 씨앗을 피게 하게 한다
		
		// 모두 다 돌아본다, 근데 4방했을 때 범위를 벗어나거나 혹은 visited가 있다면 continue함
		n = Integer.parseInt(br.readLine());
		mapp = new int[n][n];
		visited=new int[n][n];
				
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=0; j<n; j++) {
				mapp[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0,0);
		System.out.println(mn);
		
	}
	//dfs인자 추가
	public static void dfs(int cnt, int sm) {
		if (cnt==3) {
			mn = Math.min(sm, mn);
			return;
		}
			for (int i=0; i<n; i++) {
				for (int j=0; j<n; j++) {
					if (possible(i,j)) {
						int price = cal(i,j);
						check(i,j);
						dfs(cnt+1, sm+price);//dfs(cnt, sm+hap)
						clear(i,j);//비지티드 철회
						visited[i][j]=0;
						
					}
					}
					
				}
			} 
	public static boolean possible(int x, int y) {
		for (int k=0; k<4; k++) {
			int nx = x+dx[k];
			int ny = y+dy[k];
			if(nx>=n||ny>=n||nx<0||ny<0)
				return false;
			if (visited[nx][ny]==1) {
				return false;
			}
	}
		return true;
}
	
	public static int cal(int x, int y) {
		int hap=mapp[x][y];
		for (int k=0; k<4; k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
				hap+=mapp[nx][ny];
			}
		return hap;
	}
	
	public static void check(int x, int y) {
		visited[x][y]=1;
		for (int k=0; k<4; k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
				visited[nx][ny]=1;
			}
	}
	public static void clear(int x, int y) {
		for (int k=0; k<4; k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
				visited[nx][ny]=0;
			}
	}
	
	
	
}

