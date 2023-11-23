import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int n,m, ans;
    static int[][] mapp;
    static boolean[][] visited;
    static int[] dx ={-1,-1,0,1,1,1,0,-1};
    static int[] dy ={0,-1,-1,-1,0,1,1,1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1 : 땅, 0: 바다
        // 가로,세로 대각선 => 걸어갈 수 있음 -> 섬의 개수는?
        while (true) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            if (n==0 && m==0) break;

            mapp = new int[n][m];
            visited = new boolean[n][m];
            for (int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<m; j++) {
                    mapp[i][j]=Integer.parseInt(st.nextToken());
                }
            }

            int ans = 0; //섬 개수
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    if (mapp[i][j]==1 && !visited[i][j]) {
                        bfs(i,j);
                        ans++;
                    }
                }
            }
            System.out.println(ans);

        }

    }
    public static void bfs(int x, int y) {
        visited[x][y]=true; //방문체크
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x,y});

        while (!q.isEmpty()) {
            int[] temp =q.poll();
            int i = temp[0];
            int j = temp[1];

            for (int k=0; k<8; k++) {
                int nx = i+dx[k];
                int ny = j+dy[k];

                if (nx>=0 && nx<n && ny>=0 && ny<m) {
                    if (!visited[nx][ny] && mapp[nx][ny]==1){
                        q.add(new int[] {nx,ny});
                        visited[nx][ny]=true;
                    }
                }
            }
        }


    }

}
