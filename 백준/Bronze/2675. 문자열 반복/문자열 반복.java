
import java.io.*;


public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc=0; tc<T; tc++) {
			String sr=br.readLine();
			int r =Integer.parseInt(sr.split(" ")[0]);
			String S=sr.split(" ")[1];
			for (int i=0;i<S.length(); i++) {
				char ans = S.charAt(i);
				for (int j=0; j<r;j++) {
					System.out.print(ans);
				}
			}
			System.out.println();
		}
		
		}
			}