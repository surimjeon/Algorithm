import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 일단 모눈종이를 벗어나면안되니까. 크기순으로 정렬해서 보고 범위 벗어나면 아웃
		// 2개 스티커 뽑아서 벗어나지 않는 범위에서 가장 큰 범위 찾기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		int n = Integer.parseInt(br.readLine());
		
		int [][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st1.nextToken());
			arr[i][1]=Integer.parseInt(st1.nextToken());
		}
		int sum=0;
		int mx =0;
		//붙일 수 있는 색종이는 2개
		for (int i=0; i<n-1; i++) {
			for (int j=i+1; j<n; j++) {
				//회전 함/안함 2^^2
				//그대로
				if (arr[i][0]+arr[j][0]<=h && Math.max(arr[i][1], arr[j][1])<=w||
					arr[i][0]+arr[j][0]<=w && Math.max(arr[i][1], arr[j][1])<=h) {
					sum=arr[i][0]*arr[i][1] + arr[j][0]*arr[j][1];
				}
				//뒤 스티커 세로로 뒤집기
				else if (arr[i][0]+arr[j][1]<=h && Math.max(arr[i][1], arr[j][0])<=w||
						arr[i][0]+arr[j][1]<=w && Math.max(arr[i][1], arr[j][0])<=h) {
					sum=arr[i][0]*arr[i][1] + arr[j][0]*arr[j][1];
				}
				//앞 스티커 세로로 뒤집기
				else if (arr[i][1]+arr[j][0]<=h && Math.max(arr[i][0], arr[j][1])<=w||
						arr[i][1]+arr[j][0]<=w && Math.max(arr[i][0], arr[j][1])<=h) {
					sum=arr[i][0]*arr[i][1] + arr[j][0]*arr[j][1];
				}
				//두 스티커 모두 뒤집기
				else if (arr[i][1]+arr[j][1]<=h && Math.max(arr[i][0], arr[j][0])<=w||
						arr[i][1]+arr[j][1]<=w && Math.max(arr[i][0], arr[j][0])<=h) {
					sum=arr[i][0]*arr[i][1] + arr[j][0]*arr[j][1];
				}
				if(mx < sum) mx = sum;
			}
		}
		System.out.println(mx);

	}
}