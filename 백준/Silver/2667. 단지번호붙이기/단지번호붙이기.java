
import java.io.*;
import java.util.*;

public class Main {
	public static int[][] visited;
	public static int[][] mapp;
	public static int n;
	
	
	public static int bfs(int x, int y) {
		Queue<int []> q = new LinkedList<>();
		int[] dx = new int[]{-1,0,1,0};
		int[] dy = new int[]{0,-1,0,1};
		
		int cnt=1;
		visited[x][y]=1;
		q.add(new int[] {x,y}); //객체에 추가할 때 주의! new int[]
		
		while(!q.isEmpty()) {
			int[] temp= q.poll();
			int i =temp[0];
			int j =temp[1];
			
			for (int k=0; k<4; k++) {
				int nx = i+dx[k];
				int ny = j+dy[k];
				
				if (nx>=0 && nx<n && ny>=0 && ny<n) {
					if (visited[nx][ny]==0 && mapp[nx][ny]==1) {
						visited[nx][ny]=1;
						q.add(new int[] {nx,ny});
						cnt+=1;
					}
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//좌우, 혹은 아래위로 다른 집이 있는 경우  같은 단지
		//추적하다가,,1이 있으면 visited체크하고, 경로를 체크하자 
		//오름차순으로 정렬하려면 ,,,linkedList해서 collection.sort()사용하기 
		n = Integer.parseInt(br.readLine());
		mapp = new int[n][n];
		visited= new int[n][n];
		ArrayList<Integer> ans = new ArrayList<>();
		
		//mapp에 추가
		for(int i=0; i<n; i++) {
			String temp = br.readLine();
			for (int j=0; j<n; j++) {
				mapp[i][j]=temp.charAt(j)-'0';
			}
		}
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mapp[i][j]==1 && visited[i][j]==0) {
					int cnt = bfs(i,j);
					ans.add(cnt);
				}
			}
		}
		//정렬해서 출력
		Collections.sort(ans);
		sb.append(ans.size()).append("\n");
		for(int i=0; i<ans.size(); i++) {
			sb.append(ans.get(i)).append("\n");
		}
		System.out.println(sb);
		
	}

}
