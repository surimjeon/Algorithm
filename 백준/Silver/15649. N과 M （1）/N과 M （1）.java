import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int[] arr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited=new boolean[n];
        arr=new int[m];

        dfs(n,m,0);

    }

    private static void dfs(int n, int m, int idx) {
        if (idx==m) {
            for (int a : arr) {
                System.out.print(a+" ");
            }
            System.out.println();
            return;
        }

        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                visited[i]=true;
                arr[idx]=i+1;
                dfs(n,m,idx+1);
                visited[i]=false;
            }
        }
    }

}