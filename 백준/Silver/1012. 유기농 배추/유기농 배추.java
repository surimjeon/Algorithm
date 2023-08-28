
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    static int mn, m,n;
    static int[][] mapp;
    static boolean[][] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            mn=0;

            mapp = new int[m][n];
            visited= new boolean[m][n];

            for (int j=0; j<k; j++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st1.nextToken());
                int y = Integer.parseInt(st1.nextToken());
                mapp[x][y]=1;
            }

            bfs();
            System.out.println(mn);
        }


    }
    public static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        int[] dx = new int[] {1,0,-1,0};
        int[] dy = new int[] {0,1,0,-1};

        for (int j=0; j<m; j++) {
            for (int l=0; l<n; l++) {
                if (mapp[j][l]==1 && !visited[j][l]) {
                    q.add(new int[]{j,l});
                    mn++;
                    while (true) {
                        if (q.isEmpty()) {
                            break;
                        }
                        int[] temp=q.poll();
                        int x = temp[0];
                        int y = temp[1];
                        visited[x][y]=true;

                        for (int a=0; a<4; a++) {
                            int nx = x+dx[a];
                            int ny = y+dy[a];
                            if (0<=nx && nx<m && 0<=ny && ny<n) {
                                if (mapp[nx][ny]==1 && !visited[nx][ny]) {
                                    visited[nx][ny] = true;
                                    q.add(new int[] {nx,ny});
                                }
                            }
                        }

                    }
                }
            }
        }
    }
}
