
import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//에너지 드링크 고르기, 붓는 양의 절반을 흘림, 남은건 버리기
		//하나 남을 때까지 반복->합쳐진 드링크의 양을 최대로 하기(양의 최대는?)
		
		int n = Integer.parseInt(br.readLine());
		double arr[] = new double[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i]=Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		double hap = 0;
		
		for (int i=0; i<n-1; i++) {
			hap+=(arr[i]/2);
		}
//		int ans = (int) (hap+arr[n-1]);
		System.out.println((hap+arr[n-1]));
		
		
		
		
		
		}
	}


