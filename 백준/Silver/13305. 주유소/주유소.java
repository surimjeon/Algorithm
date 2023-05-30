

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //도시의 개수
		//도로의 길이
		int[] length = new int[n-1];
		int[] price = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n-1; i++) {
			length[i]=Integer.parseInt(st.nextToken());
		}
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			price[i]=Integer.parseInt(st1.nextToken());
		}
		
		//최소의 경우 내림차순을 만족할 떄, 아니라면 min값을 기름값에 곱해준다
		int mn = price[0];
		int hap = 0; 
		
		for (int i=0; i<n-1; i++) {
			if (price[i]<=mn) {
				mn=price[i];
			}
			int temp= mn * length[i];
			hap+=temp;
		}
		
		System.out.println(hap);
	}

}
