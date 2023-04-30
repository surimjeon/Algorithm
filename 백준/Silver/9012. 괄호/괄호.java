
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//남아있는 경우,empty인데 빼려고하는 경우 no!
		int T =Integer.parseInt(br.readLine());
		
		for (int i=0;i<T;i++) {
			Stack<Character> st = new Stack<>();
			char[] arr = br.readLine().toCharArray();
			int j=0;
			String ans = "YES";
			while (j<arr.length) {
				if (arr[j]=='(') { //char을 비교할 떈 ==사용(기본형), 문자열(참조형)
					st.push('(');
				}
				else {
					if (st.isEmpty()) {
						ans="NO";
						break;
					}
					else {
					st.pop();
					}
				}
				j++;
				if (j==arr.length && !st.isEmpty()) {
					ans="NO";
				}

			}
			System.out.println(ans);
		}

	}
}


	