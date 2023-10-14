import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// 2개로 나눈팀의 합의 차이가 가장 작은 경우의 차이 구하기
//모든 조합 경우의 수를 구하는 문제 => 백트래킹으로 모든 조합구하기

public class Main {
    static StringTokenizer st;
    static int mn=Integer.MAX_VALUE;
    static int n, hap;
    static int[][] arr;
    static boolean[] visited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                arr[i][j]=Integer.parseInt(st.nextToken());
                hap+=arr[i][j];
            }
        }

        dfs(0 ,0); //현재 깊이(n/2면 합 그만)
        System.out.println(mn);

    }
    public static void dfs(int start_idx, int depth) {
        if (depth==n/2) {
            // 차이 구하기
            diff();
            return;
        }

        for (int i=start_idx; i<n; i++) { //이 문제는 순열이 아닌 조합이기 때문에
        //i를 0부터 하면 재귀를 많이 돌려야하기 때문에 start부터 조합을 세린다
            if(!visited[i]) {
                visited[i]=true;
                dfs(i+1, depth+1);
                visited[i]=false; //재귀가 끝나면 비망문으로 변경
            }

        }
    }
    public static void diff() {
        int start_team=0;
        int link_team=0;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) { // 반복을 줄이기 위해
                if(visited[i] && visited[j]) {
                    start_team+=arr[i][j];
                    start_team+=arr[j][i];
                } else if (!visited[i] && !visited[j]) {
                    link_team+=arr[i][j];
                    link_team+=arr[j][i];
                }
            }
        }

        int cha = Math.abs(start_team-link_team);

        if (cha==0) {
            System.out.println(cha);
            System.exit(0);
        }

        mn = Math.min(cha, mn);

    }

}