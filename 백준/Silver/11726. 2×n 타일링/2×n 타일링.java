import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] ans = new long[1001];
        int n = Integer.parseInt(br.readLine());

        ans[1]=1;
        ans[2]=2;

        for (int i=3; i<=n; i++) {
            ans[i]=(ans[i-2]+ans[i-1])%10007;
        }

        System.out.println(ans[n]%10007);


        }


}


