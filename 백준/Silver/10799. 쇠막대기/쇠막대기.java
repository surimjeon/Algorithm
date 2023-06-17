
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 바로인접한 괄호는 레이저
		// rr게 되어있는 괄호는 막대기
		Stack<Character> stack = new Stack<>();
		// 남아있는 (개수만큼 잘린다
		String temp = br.readLine();
		int cnt =0;
		
		for (int i=0; i<temp.length(); i++) {
			if (temp.charAt(i)=='(') {
				stack.push('(');
			}
			else {
				stack.pop(); //그전의 괄호가 열린거면 레이저(사이즈만큼 더해주기
				if(temp.charAt(i-1)=='(') {
					cnt+=stack.size();
				}
				else {
					cnt++; //단순한 닫힌 괄호는 그냥 선이 끝나는 것(+1)
				}
			}
		}
		System.out.println(cnt);

	}

}





