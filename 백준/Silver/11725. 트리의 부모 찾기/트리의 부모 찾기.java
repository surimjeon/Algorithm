
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n =Integer.parseInt(br.readLine());
		ArrayList<Integer> arr[] = new ArrayList[n+1]; //n+1만큼 배열 만들기
		
		for(int i=1; i<n+1; i++) {
			arr[i]=new ArrayList<Integer>(); //1번부터 n까지 각 배열에 또 배열을 넣기
		}
		for (int i=1; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			arr[start].add(end);
			arr[end].add(start); //양방향 추가
		}
		
		boolean[] visited = new boolean[n+1]; //노드별로 방문체크
		int [] parent= new int[n+1]; 
		Queue<Integer> q = new LinkedList<>();
		q.add(1); //1번부터 탐색시작
		visited[1]=true; //방문체크
		
		
		while (!q.isEmpty()) {
			int idx = q.poll();
			for(int num : arr[idx]) { //idx와 연결되어있는 모든 요소들의 부모로 추가하기 위해 
				if (!visited[num]) { //num를 체크하지 않았다면(방문하지 않았다면)
				parent[num]=idx; //연결된 노드에 idx를 부모로 추가
				visited[num]=true;//방문체크
				q.add(num);//다음 번호(num) 큐에 넣기
				}

			}
		}
		for (int i=2; i<n+1; i++) {
			System.out.println(parent[i]);
		}
	}
}