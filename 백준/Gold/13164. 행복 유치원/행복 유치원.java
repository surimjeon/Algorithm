
import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		ArrayList<Integer> term = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st1.nextToken());
		}
		
		for (int i=1; i<n; i++) {
			term.add(arr[i]-arr[i-1]);
		}
		
		int ans =0;
		Collections.sort(term);
		//n-k는 각 그룹을 몇번 합쳐야하는지(2번 그룹 내 차이를 구하면된다)
		//조별로 인원수가 같을 필요가 없기 떄문에 최소의 차이가 나는 애들만 그룹짓는 횟수만큼 뽑아내면 됨
		for(int i=0; i<n-k;i++) {
			ans+=term.get(i);
		}
		System.out.println(ans);
		
	}
}

