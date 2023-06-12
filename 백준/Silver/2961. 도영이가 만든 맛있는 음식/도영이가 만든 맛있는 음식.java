
import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static int mn=Integer.MAX_VALUE;
	static int[][] arr;
	static boolean [] visited;
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//신맛은 곱, 쓴맛은 합, 재료는 적어도 하나 사용
		//신맛과 쓴맛 차이가 가장 작은 요리
		//그 재료를 넣어보던가 / 넣어보지 않는다 = 백트래킹
		
		n = Integer.parseInt(br.readLine());
		
		arr= new int[n][2];
		visited = new boolean[n];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0);
		System.out.println(mn);
	}
	
	public static void dfs(int idx) {
		if (idx==n) { //경우별로 몇번쨰를 다 돌았다면
			int sin =1;
			int ssn =0;
			int cnt =0; //하나라도 선택했는지 체크해보려고
			
			for(int i=0; i<n; i++) {
				if (visited[i]) { //방문했으면
					sin*=arr[i][0];
					ssn+=arr[i][1];
					cnt++;
				}
			}
			if (cnt!=0) { //요리를 하나라도 선택했으면
				mn = Math.min(mn, Math.abs(sin-ssn));
				return; //mn값 갱신했다면 return 
			}
			else return; //요리를 하나라도 선택안했으면 그냥 return
		}
		visited[idx]=true; //요리를 하나씩 넣어보거나
		dfs(idx+1);
		visited[idx]=false; //안넣어보거나
		dfs(idx+1);
		
	}

}



