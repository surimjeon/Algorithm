import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] n = br.readLine().split(" ");
		int f_n = Integer.parseInt(n[0]);
		int l_n = Integer.parseInt(n[1]);
		
		//두 수보다 작은 수에서 -1감소해가면서 두개가 같이 0으로 나눠떨어지는 것,
		//최대공약수로 나눴을 떄의 몫을 모두 곱하면 됨
		int mn = Math.min(f_n, l_n);
		int divisor = 0;
		for (int i=mn; i>=1; i--) {
			if (f_n%i==0 && l_n%i==0) {
				divisor=i;
				break;
			}
		}
		System.out.println(divisor);
		System.out.println(divisor*(f_n/divisor)*(l_n/divisor));
		
		}
		
		
	}


	