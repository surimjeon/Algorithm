import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//다음줄은 무조건 더 크고, n번째로 큰 수가 나와야 한다.
		// 우선순위 큐는 우선순위 순으로 자동 정렬이 된다
		// 정렬한 후 n만큼 남겨두고 모두 넣어주고 빼주면 n순서가 온다 
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		//add와 offer의 차이 : 큐가 꽉차있을 떄 add는 예외, offer는 false를 리턴
		for (int i=0; i<n; i++) {
			pq.offer(Integer.parseInt(st.nextToken()));
		}
		
		for (int i=1; i<n; i++ ) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for (int j=0; j<n; j++) {
				int temp = Integer.parseInt(st1.nextToken());
				pq.offer(temp);
				pq.poll();
				
			}
		}
		
		System.out.println(pq.poll());
		
	}
}