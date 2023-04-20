import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr=new int[9];
		int mx=Integer.MIN_VALUE;
		int idx=0;
		for (int i=0;i<9;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if (mx<arr[i]) {
				idx=i+1;
				mx=arr[i];
			}
		}
		sb.append(mx).append("\n").append(idx);
		System.out.println(sb);
	}
}
