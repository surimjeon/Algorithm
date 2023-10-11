import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int[] cal, arr; //+, -, *, /
    static int n;
    static int mn = Integer.MAX_VALUE;
    static int mx = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        cal = new int[4];
        st = new StringTokenizer(br.readLine());
        // 모든 경우는 브루트포스로, 각각은 백트래킹으로
        for (int i = 0; i < 4; i++) {
            cal[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr[0], 1); //현재 합(숫자), 깊이(idx-> 숫자 다 돌고있는지 확인)


        System.out.println(mx);
        System.out.println(mn);
    }

    private static void dfs(int num, int idx) {
       if (idx==n) {
           mn=Math.min(mn, num);
           mx=Math.max(mx,num);
           return;
       }

       //표시된 연산자를 모두 돌면서 백트래킹
        for (int i=0; i<4; i++) {
            if (cal[i]>0) {
                cal[i]--;

                if(i==0) {
                    dfs(num+arr[idx], idx+1);
                }
                else if (i==1) {
                    dfs(num-arr[idx], idx+1);
                }
                else if (i==2) {
                    dfs(num*arr[idx], idx+1);
                }
                else {
                    dfs(num/arr[idx], idx+1);
                }
                cal[i]++;
            }
        }

    }
}
