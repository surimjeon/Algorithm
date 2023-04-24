import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mx =0; //최대길이구하기 
		char[][] arr = new char[5][15];
		for (int i=0; i<5; i++) {
			String txt = br.readLine();
			for (int j=0; j<txt.length(); j++) {
				arr[i][j]=txt.charAt(j);
			}
			if (txt.length()>mx) {
				mx=txt.length();
			}
		}
			
		StringBuilder sb = new StringBuilder();
		for (int j=0;j<mx;j++) {
			for (int i=0; i<5;i++) {
				if (arr[i][j]=='\0') {
					continue; //빈칸이면 출력이 아니라 계속해야 함
				}
				else {
					sb.append(arr[i][j]);
				}

	}
	}
		System.out.println(sb);
	}
}
		