

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	//x는 aaaa혹은 bb로 덮고, .는 덮으면 안됨, 덮을 수 없다면 -1 출력
		//x가 4개가 연속되면 aaaa로 덮고, else if 2개로 연속되면 bb로 덮고
		char[] board = br.readLine().toCharArray();
		int cnt = 0;
		int idx=0;
		for(int i=0; i<board.length; i++) {
			if (board[i]=='X') {
				if (cnt==0) {
					idx=i;
				}
				cnt+=1;
			}
			else if (board[i]=='.') {
				cnt=0;
			}
			if (cnt==4) {
				cnt=0;
				for(int j=idx; j<idx+4; j++) {
					board[j]='A';
				}
			}
		}
		
		cnt = 0;
		idx=0;
		for(int i=0; i<board.length; i++) {
			if (board[i]=='X') {
				if (cnt==0) {
					idx=i;
				}
				cnt+=1;
			}
			else if (board[i]=='.') {
				cnt=0;
			}
			if (cnt==2) {
				cnt=0;
				for(int j=idx; j<idx+2; j++) {
					board[j]='B';
				}
			}
		}
		for(int i=0; i<board.length; i++) {
			if (board[i]=='X') {
				sb.setLength(0);
				sb.append(-1);
				break;
			}
			sb.append(board[i]).append("");
		}
		System.out.println(sb);
	}
}