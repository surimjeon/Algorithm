
import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S =br.readLine();
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		for (int i=0; i<S.length(); i++) {
			int idx=(int)(S.charAt(i)-97);
			if (arr[idx]==-1)
					arr[idx]=i;
		}
		for (int i=0; i<26;i++) {
			System.out.print(arr[i]+" ");
		}
		
		}
	}