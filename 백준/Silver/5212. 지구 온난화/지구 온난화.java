
import java.io.*;

import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		//인접한 3~4칸에 바다가 있는 땅은 모두 잠김
		//x땅, .바다
		//출력에 섬은 적어도 한개
		//또, 지도에 없는 곳, 지도의 범위를 벗어나는 칸은 모두 바다 
		
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		char[][] mapp = new char[r][c];
		char[][] ansmapp = new char[mapp.length][];
		int [] dx = {-1,0,1,0};
		int [] dy = {0,-1,0,1};
		int mnr= r, mnc=c;
		int mxr=0, mxc=0;
		
		
		for (int i=0;i<r; i++) {
			String temp=br.readLine();
			for (int j=0; j<c; j++) {
				mapp[i][j]=temp.charAt(j);
			}
		} //지도에 집어넣기
		
		for (int i=0; i<mapp.length; i++) {
			ansmapp[i]=Arrays.copyOf(mapp[i], mapp[i].length);
		}
		
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				if (mapp[i][j]=='X') {
					int cnt=0;
				for (int k=0;k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if (nx>=0 && ny>=0 && nx<r && ny<c) {
						if (mapp[nx][ny]=='.') cnt+=1;}
					if (nx<0 || ny<0 || nx>=r || ny>=c) cnt+=1;
				}
				if (cnt>=3) ansmapp[i][j]='.';
				else {
					mnr=Math.min(mnr, i);
					mnc=Math.min(mnc, j);
					mxr=Math.max(mxr, i);
					mxc=Math.max(mxc, j);
				}
				}	
			}
		}
		
		
		for (int i=mnr; i<=mxr; i++) {
			for (int j=mnc; j<=mxc; j++) {
				sb.append(ansmapp[i][j]);
				}
			sb.append("\n");		
			}
		System.out.println(sb);
	}
}