import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int[][] arr;
    static boolean[][] visited;
    static int n,m,k,mx,temp;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 가장 큰 음식물 크기 구하기
        st= new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i=0; i<k; i++) {
            st= new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr[r-1][c-1]=1;
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (arr[i][j]==1 && !visited[i][j]) {
                    temp = 0;
                    dfs(i,j);
                    mx = Math.max(mx, temp);
                }
            }
        }

        System.out.println(mx);

    }

    public static void dfs(int x, int y) {
        visited[x][y]=true;
        temp++;

        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (!visited[nx][ny] && arr[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }

        }

    }

}
