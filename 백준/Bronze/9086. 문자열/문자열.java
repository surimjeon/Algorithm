import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int tc=0;tc<T;tc++) {
			String word=br.readLine();
			System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
		}
			}
	}