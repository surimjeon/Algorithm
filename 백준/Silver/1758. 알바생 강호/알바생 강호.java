
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//원래 주려고 생각했던 돈 - (받은 등수 - 1) 만큼의 팁
		//음수이면 돈을 주지 않음 =제일 돈이 적은 사람 
		//받을 수 있는 팁의 최대값 
		int n = Integer.parseInt(br.readLine());
		Integer [] arr = new Integer[n];
		for (int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		long ans =0;
		
		for (int i=0; i<n; i++) {
			long temp=arr[i]-(i);
			if (temp<=0) {
				break;
			}
			ans+=temp;
			
		}
		System.out.println(ans);
		
		
		
	}
}