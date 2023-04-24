
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int[] com = new int[] {1,1,2,2,2,8};
	int[] ans = new int[6];
	String item = br.readLine();
	StringBuilder sb = new StringBuilder();
	for (int i=0; i<6; i++) {
		ans[i]=com[i]-Integer.parseInt(item.split(" ")[i]);
		sb.append(ans[i]).append(" ");
	}
	System.out.println(sb);
	}
}
		