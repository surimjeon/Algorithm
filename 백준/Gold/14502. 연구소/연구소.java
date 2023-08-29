import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int mn=Integer.MIN_VALUE;
    static int n,m;
    static int[][] mapp;
    static int[] dx = new int[] {-1, 0, 1, 0};
    static int[] dy = new int[] {0, 1, 0,-1};


    public static void main(String[] args) throws IOException {
        //0의 크기 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //세로
        m = Integer.parseInt(st.nextToken()); //가로

        mapp = new int[n][m];

        for (int i=0; i<n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                mapp[i][j]=Integer.parseInt(st1.nextToken());
            }
        }

        dfs(0);
        System.out.println(mn);
    }
    public static void dfs(int block) {
        if (block==3) {
            bfs();
            return;
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (mapp[i][j]==0) {
                    mapp[i][j]=1;
                    dfs(block+1);
                    mapp[i][j]=0;
                }
            }
        }
    }


    private static void bfs() {
        //현재 맵에서 안전 얼만큼??연결??
        Queue<int[]> q = new LinkedList<>();

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (mapp[i][j]==2) {
                    q.add(new int[]{i,j});
                }
            }
        }

        //원본을 바꾸지 않기 위해 카피맵 사용
        int[][] copymap = new int[n][m];

        for (int i = 0; i < n; i++) {
            copymap[i] = mapp[i].clone();
        }

        while (!q.isEmpty()) {
            int[] temp =q.poll();
            int x= temp[0];
            int y = temp[1];

            for (int k=0; k<4; k++) {
                int nx = x+dx[k];
                int ny = y+dy[k];

                if (nx>=0 && nx<n && ny>=0 && ny<m ) {
                    if (copymap[nx][ny]==0) {
                        copymap[nx][ny]=2;
                        q.add(new int[] {nx,ny});
                    }
                }

            }

        }

        safe(copymap);
    }

    public static void safe(int[][] copymap) {
        int hap =0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (copymap[i][j]==0) {
                    hap++;
                }
            }
        }
        mn = Math.max(hap,mn);




    }


}
