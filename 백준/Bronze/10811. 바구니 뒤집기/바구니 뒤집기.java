
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr=new int[n];
		
		for (int i=0;i<n; i++) arr[i]=i+1;
		//반으로 나눠서 temp로 돌리기
		for (int k=0;k<m;k++) {
			String in=br.readLine();
			st=new StringTokenizer(in);
			int i=Integer.parseInt(st.nextToken());
			int j=Integer.parseInt(st.nextToken());
			int temp =0;
			for (int l=0;l<(j-i+1)/2;l++) {
				temp=arr[i-1+l];
				arr[i-1+l]=arr[j-1-l];
				arr[j-1-l]=temp;
			}
		}
		for (int i=0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	}