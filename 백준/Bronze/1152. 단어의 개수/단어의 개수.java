import java.io.*;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int cnt =0;
		while (st.hasMoreTokens()) { //다음 토큰이 있다면
			cnt++;
			st.nextToken(); //다음 토큰을 받아오기
		}
		
		System.out.println(cnt);
		
		
		}
			}