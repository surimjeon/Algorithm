
import java.io.*;
import java.util.*;

public class Main {
	static long A,B;
	static long mn=Long.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        
        dfs(A,1);
        if (mn==Long.MAX_VALUE) mn=-1;
        System.out.println(mn);
		
	}
	public static void dfs(long num, int cnt) {
		if (B==num) {
			mn = Math.min(mn, cnt);
			return;
		}
		else if (B<num) return;
		
		dfs(num*2, cnt+1);
		dfs(num*10+1,cnt+1);

	}

}

