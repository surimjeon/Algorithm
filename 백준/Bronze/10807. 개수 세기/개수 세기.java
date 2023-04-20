import java.util.*;
public class Main {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		int cnt=0;
		//for문으로 돌면서 int 형으로 받아오기
		for (int i=0; i<n; i++) arr[i]=sc.nextInt();
		int v = sc.nextInt();
		
		for (int i=0;i<n; i++) {
			if (arr[i]==v) cnt+=1;
		}
		System.out.print(cnt);
	}
}
