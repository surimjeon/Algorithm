
import java.io.*;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ab=br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		int n=Integer.parseInt(ab[0]);
		int m=Integer.parseInt(ab[1]);
		int[][] arr1=new int[n][m];
		
	for (int k=0; k<2; k++) {
		for(int i=0; i<n;i++) {
			String[] temp=br.readLine().split(" ");
			for (int j=0;j<m;j++) {
				arr1[i][j]+=Integer.parseInt(temp[j]); //한줄
			}
		}
		
		}
		for (int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				sb.append(arr1[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		}
			}