import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st= new StringTokenizer(br.readLine());

        // 2 1 1 2 => 시계수는 어떻게 판다..
        //4개의 경우를 모두 판단??-> 가장 작은것..?
        int[] arr = new int[4];


        for (int i=0; i<4; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int clock = num(arr[0], arr[1], arr[2], arr[3]);

        //모든 시계수 구하기
        boolean[] visited = every();

        int ans = 0;
        for (int i=1111; i<=clock; i++) {
            if (visited[i]) {
                ans++;
            }
        }

        System.out.println(ans);

    }

    public static boolean[] every() {
        boolean[] visited= new boolean[10000];
        for (int i=1; i<10; i++) {
            for (int j=1; j<10; j++) {
                for (int k=1; k<10; k++) {
                    for (int l=1; l<10; l++) {
                        int temp = num(i,j,k,l);

                        if (!visited[temp]) {
                            visited[temp]=true;
                        }
                    }
                }
            }
        }
        return visited;
    }

    public static int num(int a, int b, int c, int d) {
        int ans = Integer.MAX_VALUE;

        int mn = Math.min(a*1000+b*100+c*10+d, b*1000+c*100+d*10+a);
        int mn2 = Math.min(c*1000+d*100+a*10+b, d*1000+a*100+b*10+c);
        ans = Math.min(Math.min(mn, mn2), ans);

        return ans;

    }



}
