import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
        static StringTokenizer st;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int idx = 1; //커지는 수
        int ans =0; //정답(자리수)
        int num = 10;

        for (int i=1; i<=n; i++) {
            if (i%num==0) {
                idx++;
                num*=10;
            }
            ans+=idx;
        }

        System.out.println(ans);



        }
    }

