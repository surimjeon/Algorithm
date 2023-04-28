
import java.io.*;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int ans = Integer.parseInt(br.readLine());
		int [][] mapp = new int[n][n];
		// 방향은 아래, 오른, 위, 왼 순으로..
		int dir = 0;
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		int x=0;
		int y=0;
		int num=n*n;
		int ans_x=0;
		int ans_y=0;
		
		while (true) {
			mapp[x][y]=num;
			int nx=x+dx[dir];
			int ny=y+dy[dir];
			
			if (num==ans) {
				ans_x=x+1;
				ans_y=y+1;
			}
			
			if (nx<0 || ny<0 || nx>=n || ny>=n || mapp[nx][ny]!=0) {
				dir=(dir+1)%4;
			}
			
			
			x+=dx[dir];
			y+=dy[dir];
			num--;
			
			
			
		if (num==0) break;
		}
		
		
		
	for (int i=0; i<n; i++) {
		for (int j=0; j<n; j++) {
			sb.append(mapp[i][j]).append(" ");
		}
		System.out.println(sb);
		sb.setLength(0);
	}
	System.out.print(ans_x+" "+ans_y);
	}	
}


	