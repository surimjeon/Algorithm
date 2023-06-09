
import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 연산자가 +만 있을 떄나 -만있을 떄는 괄호를 어떻게 쳐도 상관없고,
		//섞여있을 떄는 최대한 뺄셈을 크게 하기 위해 +는 최대로 해서 -을 한다
		StringTokenizer st = new StringTokenizer(br.readLine(),"-");
		//-를 기준으로 쪼갠다
		
		int mn=Integer.MAX_VALUE;
		while (st.hasMoreTokens()) { //토큰이 남아있을 때까지
			int temp=0;
			//토큰 내 덧셈이 있는 경우에는 +으로 나눠주기(덧셈이 없든 있든 숫자가 들어감)
			StringTokenizer add = new StringTokenizer(st.nextToken(),"+");
			
			while (add.hasMoreTokens()) {
				temp+=Integer.parseInt(add.nextToken());
			}
			
			//뺼셈을 해줘야할시간,,, 
			if (mn==Integer.MAX_VALUE) {
				mn=temp; //초기값일 경우에는 mn=temp
			}
			else {
				mn-=temp;
			}
			
		}
		System.out.println(mn);
		
	}
}