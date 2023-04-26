
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] bingo = new int[5][5];
		int[][] ment = new int[5][5];
		for (int i=0; i<5; i++) {
			String txt = br.readLine();
			for (int j=0; j<5; j++) {
				bingo[i][j]=Integer.parseInt(txt.split(" ")[j]);
			}
		}
		//하나씩 받아오기-> 불렀으면 0으로 만들어버리기
		// 가로가 모두 0이면 -> 가로,,, 세로가 0이면,,
		
		
		int ans =0;
		int turn =1;
		for (int k=0; k<5; k++) {
			String txt1 = br.readLine();
			for (int l=0; l<5; l++) { //사회자 멘트하나씩 돌기
				int num=Integer.parseInt(txt1.split(" ")[l]); //5
				for (int i=0; i<5; i++) { //빙고판 한번씩 돌기
					for (int j=0; j<5; j++) {
						if (bingo[i][j]==num) {
							bingo[i][j]=0;
						}
					}
				}
				//해당 사회자의 말이 있는지 
				//행체크
				for(int a=0; a<5; a++) {
					int cnt =0;
					for(int b=0; b<5; b++) {
						if(bingo[a][b]==0) {
							cnt++;
						}
					}
					if (cnt==5) {ans++;
					}
				}
				for(int a=0; a<5; a++) {
					int cnt =0;
					for(int b=0; b<5; b++) {
						if(bingo[b][a]==0) {
							cnt++;
						}
					}
					if (cnt==5) ans++;
				}
				//아래로가는 대각선
				int cnt =0;
				for (int a=0; a<5; a++) {
					if (bingo[a][a]==0) {
						cnt++;
					}
				}
				if (cnt==5) ans++;
				
				//위로 가는 대각선
				int cnt1 =0;
				for (int a=0; a<5; a++) {
					if (bingo[a][4-a]==0) {
						cnt1++;
					}
				}
				if (cnt1==5) ans++;
				if (ans>=3) {
					System.out.println(turn);
					System.exit(0);  //정상종료
				}
				ans=0;
				turn++;
			}
		}

	}
}