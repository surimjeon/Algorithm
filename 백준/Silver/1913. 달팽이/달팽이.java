
import java.io.*;
import java.util.Arrays;


// 첫시작은 n//2, n//2
// 2개씩 4방향, 4개씩 4방향, 6개씩 4방향...
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//달팽이 달팽이.. 
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int ans = Integer.parseInt(br.readLine());
		int [][] mapp = new int[n][n];
		
		int x = n/2;
		int y = n/2;
		//방향 0: 위, 1: 오, 2: 아래, 3: 왼쪽
		int [] dir_x = {0, 1,0,-1};
		int [] dir_y = {1,0,-1,0};
		int ln=0;
		int i =1;
		mapp[x][y]=i;
		int ans_x=0;
		int ans_y=0;
		
		if (i==ans) {
			ans_x = x+1;
			ans_y= y+1;
		}
		
		while (true) {
				for (int k=0; k<4; k++) { //4방향
					for (int l=0; l<ln; l++) { //ln을 지정할 수 없어서??
						x+=dir_x[k]; //위
						y+=dir_y[k];
						i++;
						mapp[x][y]=i;
						if (i==ans) {
							ans_x = x+1;
							ans_y = y+1;
						}
					} // 한 방향으로 돌고
				
				}
				if (x==0 && y==0) break;
				x-=1;
				y-=1;
				ln+=2;
			}
		
	for (int i1=0; i1<n; i1++) {
		for (int j=0; j<n; j++) {
			sb.append(mapp[i1][j]).append(" ");
		}
		System.out.println(sb);
		sb.setLength(0);
	}
	System.out.print(ans_x+" "+ans_y);
	}	
}


	