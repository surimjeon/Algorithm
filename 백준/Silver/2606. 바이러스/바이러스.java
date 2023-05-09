import java.io.*;
import java.util.*;


public class Main {
	static int visited[];
	static int arr[][];
	static int cnt,m,n;
	
	
	//bfs선언(static으로 선언하면, 인스턴스 메소드가 아니어서 사용가능)
	public static int bfs(int start) {
		Queue <Integer> q = new LinkedList<>();
		q.add(start);
		visited[start]=1;
		
		while(!q.isEmpty()) {
			int node = q.poll();
			for(int i=1;i<=n; i++) { //x는 노드
				if(visited[i]==0 && arr[node][i]==1 ) { //방문하지 않았고, 해당노드의 몇번째가 1(존재함)이라면
					visited[i]=1;
					q.add(i);
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//연결되어있는지 보고, 1번컴퓨터에 바이러스가 걸리는 수?
		n =Integer.parseInt(br.readLine());
		m =Integer.parseInt(br.readLine());
		arr = new int[n+1][n+1];
		visited = new int[n+1];
		
		
		for(int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());
			arr[node1][node2]=arr[node2][node1]=1;
		}
		System.out.println(bfs(1));

	}
	
}