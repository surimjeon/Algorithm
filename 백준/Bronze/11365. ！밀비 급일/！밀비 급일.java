
import java.io.*;

import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1 = new StringBuilder();
		
		
		while (true) {
			String temp = br.readLine();
			StringBuffer  sb = new StringBuffer(temp);
			if (temp.equals("END")) break;
			String re = sb.reverse().toString();
			sb1.append(re).append("\n");
		}
		System.out.println(sb1);
	}
}