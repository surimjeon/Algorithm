
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		// 폭탄이 있는 칸은 3초가 지난 후에 폭발, 인접한 네 칸도 함께 파괴
		//빈 칸은 '.'로, 폭탄은 'O'
		//처음1초 아무렇지 않음
		//다음 1초, 폭탄이 설치되어 있지 않은 모든 칸에 폭탄을 설치
		// 마지막 1초, 처음 설치된 폭탄이 폭발하면서 인접한 네 칸도 함께 파괴
		int r = Integer.parseInt(st.nextToken()); 
		int c = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken()); //n초가 흐른 후

		int[] dx = new int[] {-1,0,1,0};
		int[] dy = new int[] {0,-1,0,1};
		int time=0;
		
		char [][] mapp=new char[r][c];
		int[][]bombtime = new int[r][c]; //각칸에 폭탄들이 놓인 시간+3==폭탄이 터질time을 정의
		
		
		for(int i=0; i<r; i++) {
			String temp=br.readLine();
			for (int j=0; j<c; j++) {
				mapp[i][j]=temp.charAt(j);
				if (mapp[i][j]=='O') {
					bombtime[i][j]=3; //폭탄있으면 3초후 터지겠다
				}
			}
		} //봄버 지도 만들기
		
	while(time++<n) {
		if (time%2==0) {
			for (int i=0; i<r; i++) {
				for (int j=0; j<c; j++) {
					if (mapp[i][j]=='.') { //비어있는 칸에만 폭탄 설치
						mapp[i][j]='O';
						bombtime[i][j]=time+3; //폭탄 설치한 3초 후 터지게 타이머 설정
						//처음부터 폭탄이 있던 곳은 time+3하지 않는다
					}
				}
			}
		}
		else if (time%2==1) {
			for (int i=0; i<r; i++) {
				for (int j=0; j<c; j++) {
					if (bombtime[i][j]==time) { //폭탄 설치한 곳에 3초가 지났으면
						mapp[i][j]='.'; //터트리기
						 for (int k = 0; k < 4; k++) {
                             int nx = i + dx[k];
                             int ny = j + dy[k];
                             if (nx >= 0 && ny >= 0 && nx < r && ny < c) {
                             //연쇄작용이 아니면 터트리자
                            	  if(mapp[nx][ny]=='O' && bombtime[nx][ny]!=time) {
                            		  mapp[nx][ny]='.'; //2초후기 때문에 다 터트리게 됨
                            		  bombtime[nx][ny]=0; 
                            	  }
                             }
                         }
                     }
                 }
             }
         }
	}
        for (int i = 0; i < r; i++) {
            System.out.println(mapp[i]);
        }
	}
	}

                            