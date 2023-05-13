
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//이 로프를 이용해서 n개 로프 중k개 로프를 사용해서 w만큼 물체들어올릴 때 최대
		//꼭 다 선택하지 않아도 된다..작은 것들끼리 개수를 늘려가면서 카운트 하기
		int n= Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr); //정렬
		
		int mx = Integer.MIN_VALUE;//최대값 변수
		
		for (int i=0; i<n; i++) {
			mx=Math.max(mx, arr[i]*(n-i));
		}
		
		System.out.println(mx);
	}
	
}