
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		
		for (int tc=0; tc<T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			LinkedList<int[]> q = new LinkedList<>(); 
			//각 인덱스와 우선순위 저장,quque는 인덱스 접근하는 것 자체가 되지 않기 때문에 linkedlist사용
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			
			//각 index와 우선순위 저장
			for(int i=0;i<n; i++) {
				q.add(new int[] {i, Integer.parseInt(st.nextToken())});
			}
			int cnt=0;
	
			while(q.size()!=0) {
			//현재 quque의 가장 앞에 있는 문서의 중요도를 확인
			 int[] front= q.poll();
			 boolean flag=true;//가장 앞의 요소를 프린터해야할지 말아야할지 결정할 때쓰이는 flag
			 	//큐에 남아있는 원소들과 중요도를 비교한다. 
				for(int i=0; i<q.size(); i++) {
					//front값이 다른 큐보다 작은 값이 있으면 그 범위의 앞값들을 다 뒤로 돌리고 넣는다
					if (front[1]<q.get(i)[1]) {
						q.offer(front);
						for(int j=0;j<i;j++) {
							q.offer(q.poll()); 
						}
						flag=false; // 가장 앞요소를 출력하지 마..(가장 앞값보다 큰값이 있었음)
						break;
					}
				}
				//가장 앞의 요소들을 기준으로 모두 돌림
				if (flag==false) {
					continue;
				}
				// 가장앞요소가 최대값(출력)이라면 +1(몇번째출력인지)
				cnt++;
				if(front[0]==m) {
					break; // 앞요소의 인덱스가 m과 같으면 break하기
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);
		

	}
}