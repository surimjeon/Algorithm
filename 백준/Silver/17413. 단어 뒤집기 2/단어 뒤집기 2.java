
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//단어만 뒤집기, <>안은 뒤집지 않기
		StringBuilder sb = new StringBuilder();
		char[] arr = br.readLine().toCharArray();
		
		//후입선출 구조를 위해서 스택을 사용(거꾸로 출력되기 위해)
		Stack<Character> stack = new Stack<>();

		boolean num=false;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='<') {
				num=true;
				while (!stack.isEmpty()) {//<를 만나면 단어를 거꾸로 돌려서 빼내기
					sb.append(stack.pop());
				}
				sb.append(arr[i]);
			}
			else if (arr[i]=='>') {
				num=false;
				sb.append(arr[i]);
				
			}
			else if (num) {
				sb.append(arr[i]);
			}
			else if(!num) {
				if (arr[i]==' ') { //공백을 기준으로 단어를 구분하고 reverse해서 출력
					while (!stack.isEmpty()) {
					sb.append(stack.pop());
					}
					sb.append(' ');
				}
				else {
					stack.push(arr[i]);
				}
				
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
		
	}
}