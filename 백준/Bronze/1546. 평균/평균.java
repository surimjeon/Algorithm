
import java.io.*;
import java.util.*;

//최대값(M)을 골라서 모든 점수를          현재점수/ M*100으로 고치기

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr=new int[n];
		st=new StringTokenizer(br.readLine());
		
		//반으로 나눠서 temp로 돌리기
		for (int k=0;k<n;k++) {
			arr[k]=Integer.parseInt(st.nextToken());
		}
		int mx=Integer.MIN_VALUE;
		for (int k=0;k<n;k++) {
			if (arr[k]>mx) {
				mx=arr[k];
			}
		}
		double sm=0;
		double temp=0;
		for (int k=0;k<n;k++) {
			temp=(((double)arr[k])/mx)*100;
			sm+=temp;
		}
		
		double ans=sm/n;
		System.out.println(ans);
		}
	}