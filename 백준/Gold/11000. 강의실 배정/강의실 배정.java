import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[n][2];
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
		}
		
		//시작시간을 기준으로 정렬
		Arrays.sort(arr, (o1,o2)-> o1[0]==o2[0]? o1[1]-o2[1]: o1[0]-o2[0]);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int cnt =0;
		
		pq.add(arr[0][1]);
		//우선순위 큐에 첫번째 end시간을 넣는다
		for (int i=1; i<n; i++) {
			if (pq.peek()<=arr[i][0]) { //꺼낸 end값이 start값보다 작거나 같으면 새로운 강의가능
				pq.poll(); //peek은 배교, poll은 꺼내기
				pq.add(arr[i][1]);				
			}
			else {
				pq.add(arr[i][1]);
				
			}
		}
		System.out.println(pq.size());
		
	}
}

