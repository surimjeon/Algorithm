
import java.io.*;
import java.util.*;


public class Main {

	public static int n,m,x,y;	
	public static int[][] mapp, ansmapp;
	
	
	public static void bfs() {
		int [] dx = new int[] {-1,0,1,0};
		int [] dy = new int[] {0,-1,0,1};
		//큐만들기
		//방문체크 만들기
		Queue<int[]> q = new LinkedList<>();
		int [][]visited = new int[n][m];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (mapp[i][j]==1) {
					visited[x][y]=1;
					q.add(new int[] {x,y});
					
					while (!q.isEmpty()) {
						int[] temp= q.poll();
						int tp_x= temp[0];
						int tp_y= temp[1];
						
						for (int k=0; k<4;k++) {
							int nx = tp_x+dx[k];
							int ny= tp_y+dy[k];
							if (nx>=0 && ny>=0 && nx<n && ny<m) {
								if (mapp[nx][ny]==1 && visited[nx][ny]==0) {
									visited[nx][ny]=1;
									ansmapp[nx][ny]=ansmapp[tp_x][tp_y]+1;
									q.add(new int[] {nx,ny});
								}
							}
						}
					}
					if(ansmapp[i][j]==0) {
						ansmapp[i][j]=-1;
					}
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		//0 갈 수 없는 땅, 1: 갈수있는 땅, 2:목표지점
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		mapp= new int[n][m];
		ansmapp= new int[n][m];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for (int j=0; j<m; j++) {
				mapp[i][j]=Integer.parseInt(st1.nextToken());
				if (mapp[i][j]==2) {
					x=i;
					y=j;
				}
			}
		}
		
		bfs();
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
			sb.append(ansmapp[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
		
	}
	
}