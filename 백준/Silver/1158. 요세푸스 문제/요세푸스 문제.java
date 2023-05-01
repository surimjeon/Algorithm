

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr = br.readLine();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(arr.split(" ")[0]);
		int k = Integer.parseInt(arr.split(" ")[1]);
		List<Integer> list = new LinkedList<>();
		for (int i=1; i<n+1; i++) {
			list.add(i);
		}
		sb.append("<");
		int idx=0;
		while (!list.isEmpty()) {
			if (list.size()==1) {
				idx = (idx+(k-1))%(list.size());
				sb.append(list.get(idx));
				list.remove(idx);
			}
			else {
			idx = (idx+(k-1))%(list.size());
			sb.append(list.get(idx)).append(",").append(" ");
			list.remove(idx);
			}
		}
		sb.append(">");
		System.out.println(sb);
		
	}
}


	