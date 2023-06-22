

import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static char [][] star;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		//빈칸을 그려주기 위해
		int size = 4*(n-1)+1;
		star = new char [size][size];
		
		//초기화
		for (int i=0;i<size; i++) {
			for (int j=0; j<size; j++) {
				star[i][j]=' ';
			}
		}
		pointstar(size);
		// 2(2(n-1))+1 =(4n-4)+1 /  1 5 9 13
		
	}
	
	public static void pointstar(int size) {
		int idx=0;
		
		for (int i=0; i<n; i++) { //재귀 대신
			for (int j=idx;j<size-idx; j++) {
				star[idx][j]='*';
				star[size-idx-1][j]='*';
				star[j][idx]='*';
				star[j][size-idx-1]='*';
			}
			idx+=2; //한칸 띄어서 그리기 때문에 +2씩
		}
		
		for (int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
	
	
	}

}
