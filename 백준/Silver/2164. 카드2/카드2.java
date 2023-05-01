
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> quque = new LinkedList<>();
		for (int i=1; i<n+1; i++) {
			quque.add(i);
		}
		while (quque.size()!=1) {
			quque.poll();
			int top=quque.poll();
			quque.add(top);
			
		}
		System.out.println(quque.peek());
		
		
	}
}