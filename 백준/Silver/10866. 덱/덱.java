
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			String state = br.readLine();
			String st= state.split(" ")[0];
			if(st.equals("push_back")) {
				int num=Integer.parseInt(state.split(" ")[1]);
				dq.addLast(num);
			}
			else if(st.equals("push_front")){
				int num=Integer.parseInt(state.split(" ")[1]);
				dq.addFirst(num);
			}
			else if(st.equals("pop_front")){
				if (dq.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(dq.pollFirst()).append("\n");
				}
			}
			else if(st.equals("pop_back")){
				if (dq.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(dq.pollLast()).append("\n");
				}
			}
			else if(st.equals("size")){
				sb.append(dq.size()).append("\n");
			}
			else if(st.equals("empty")){
				if (dq.isEmpty()) {
					sb.append(1).append("\n");
				}
				else {
					sb.append(0).append("\n");
				}
			}
			else if(st.equals("front")){
				if (dq.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(dq.getFirst()).append("\n");
				}
			}
			else if(st.equals("back")){
				if (dq.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(dq.getLast()).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}