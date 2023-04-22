import java.io.*;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String br1=br.readLine();
		
		String a =br1.split(" ")[0];
		String b =br1.split(" ")[1];
		
		int a_r =0;
		int b_r =0;
		
		for (int i=1;i<4; i++) {
			a_r+=(int)((a.charAt(3-i)-'0')*Math.pow(10, 3-i));
			b_r+=(int)((b.charAt(3-i)-'0')*Math.pow(10, 3-i));
		}
		int ans =Math.max(a_r, b_r);
		System.out.println(ans);
		}
			}