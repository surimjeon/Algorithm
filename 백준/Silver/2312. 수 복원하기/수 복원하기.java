import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            //소인수분해
            //소수 / 지
            for (int idx=2; idx<=n; idx++) {
                if (n==1) break;
                int cnt=0;
                while (n % idx == 0) {
                    n /= idx;
                    cnt++;
                }
                if (cnt>0) {
                    System.out.print(idx);
                    System.out.print(" ");
                    System.out.print(cnt);
                    System.out.println();
                }
            }


        }

    }
}
