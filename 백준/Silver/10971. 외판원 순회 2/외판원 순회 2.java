
import java.util.*;
import java.io.*;


public class Main {
	static int n;
	static int [][] dp, arr;
	static final int INF = 100000000;
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 어느 도시에서 출발해 n개의 도시를 모두 거쳐서 다시 원래의 도시로 돌아올 떄 가장 적은 비용
		// 한번 갔던 곳은 다시 갈 수 없음 //visited체크
		//2차원 배열
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		dp = new int[n][(1<<n)-1]; // i: 현재 위치한 도시, j: 지금까지 방문한 도시 2진수
		// ex) 1<<5 = 100000(2)=32인데, 우린 1의 자리부터 시작해서 최대 11111까지 경우를 생갈할 것이기 떄문에 -1
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=0; j<n; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		//dp배열을 최대값으로 초기화
		for (int i=0; i<n; i++) {
			Arrays.fill(dp[i], INF); //Arrays.fill은 배열을 모두 같은 값으로 초기화
		}
		
		int ans = dfs(0,1); //(시작 도시, 지금까지 방문한 도시 2진수)
		//어느도시에서 시작하든지 최소비용은 같이 때문에 0번부터 시작
		System.out.println(ans);
		
		
		}
	public static int dfs(int now, int visitbit) {
		//모든 도시를 방문했다면 (visitbit에 모두 1이찍혔다면) 시작점으로 돌아간다
		if (visitbit==(1<<n)-1) {
			if (arr[now][0]==0) {
				return INF;
			}
			return arr[now][0]; //현재도시->0번째(시작도시)의 누적 이동거리
		}
		if (dp[now][visitbit]!=INF) { //dp값이 존재하는 경우(이미 최소경로를 계산했다면)
			return dp[now][visitbit];
		}
		for (int i=0; i<n; i++) { //현재 도시에서 i의 도시로 이동하는 경우
			if((visitbit & (1<<i))==0 && arr[now][i]!=0) { 
				//and연산으로, visitbit와 (1<<i)의 해당 비트가 모두 1인경우, 결과 1
				// =한번이라도 그 도시를 방문했는데(visitbit), 다시 그 도시를 방문하려는경우(1<<i)
				//arr[now][i]!=0 : 현재도시와 i사이에 이동경로가 존재한다면
				
				dp[now][visitbit] = Math.min(dp[now][visitbit], dfs(i, visitbit|(1<<i))+arr[now][i]);
				// dfs함수: visitbit에 i번째 비트를 1로 설정해서 dfs에게 현재 도시와함께 넘겨줌
				//dfs()+arr[now][i]: 현재도시에서 다음도시i까지 이동한 거리 arr[now][i]와 dp에 있는 최소갑(dp[now][visitbit])을 더해 계산
				
				// 이전에 계산된 dp배렬값과 현재 계산된 거리를 비교해서 최솟값을 arr에 구함
			}
		}
		return dp[now][visitbit];
	}
	}


