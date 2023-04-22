import java.io.*;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr=new int[9][9];
		int mx=Integer.MIN_VALUE;
		int idx_x=0;
		int idx_y=0;
		
		
		for (int i=0;i<9;i++) {
		String[] br1=br.readLine().split(" ");
		for (int j=0; j<9; j++) {
			 arr[i][j]=Integer.parseInt(br1[j]);
			 if (arr[i][j]>mx) {
				 mx=arr[i][j];
				 idx_x=i+1;
				 idx_y=j+1;
			 }
		}
		}
		System.out.println(mx);
		System.out.print(idx_x+" "+idx_y);
		}
			}