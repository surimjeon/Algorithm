
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack <Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n =Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			String txt = br.readLine();
			String state = txt.split(" ")[0];
			
			
			
			if (state.equals("push")) {
				st.push(Integer.parseInt(txt.split(" ")[1]));
			}
			else if(state.equals("pop")) {
				if (st.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(st.pop()).append("\n");
				}
			}
			else if(state.equals("size")) {
				sb.append(st.size()).append("\n");
			}
			else if(state.equals("empty")) {
				if (st.isEmpty()) {
					sb.append(1).append("\n");
				}
				else {
					sb.append(0).append("\n");
				}
			}
			else if(state.equals("top")) {
				if (st.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(st.peek()).append("\n");
				}
			}
			
		}
		System.out.println(sb);

	}
}


	