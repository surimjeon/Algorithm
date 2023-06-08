import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//배열에 글자를 하나씩 넣고, 더 적은 색의 숫자를 뽑고
		//배열의 글자가 연속되는 것과 나올 떄마다 한번씩 칠하는 것,,을 flag로 써서
		// 두개 비교?? 
		
		String color = br.readLine();
		char flag = '0';
		int b = 0;
		int r = 0;
		
		//연속되지 않으면 칠해버리는 경우
		for (int i=0; i<n; i++) {
			if (color.charAt(i)!=flag) {
				if (color.charAt(i)=='B') 
					b++;
				else r++;
			}
			flag=color.charAt(i);
			
		}
		
		System.out.println(Math.min(b, r)+1);
	}
}
