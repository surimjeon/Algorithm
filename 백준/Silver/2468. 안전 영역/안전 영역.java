import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
        static StringTokenizer st;
        static int[][] mapp;
        static int[] dx = new int[] {-1,0,1,0};
        static int[] dy = new int[] {0,-1,0,1};

        static int n;
    public static void main(String[] args) throws Exception{
        // 물에 잠기지 않는 안전영역이 최대 몇개?
        // 일정높이 이하의 지점은 물에 잠긴다 => 끊어지는 부분 ++
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        mapp = new int[n][n];

        int mxheight =0;
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                mapp[i][j]=Integer.parseInt(st.nextToken());
                mxheight= Math.max(mapp[i][j],mxheight);
            }
        }
        int answer =0;
        for (int i=1; i<=mxheight; i++) {
            int cnt = bfs(i, new boolean[n][n]);
            answer = Math.max(answer, cnt);
        }
        if (mxheight==1) {
            System.out.println(1);
        }
        else {
            System.out.println(answer);
        }
    }
    public static int bfs(int target, boolean[][] copyvisited) {
        int count = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (mapp[i][j]<=target){
                    copyvisited[i][j]=true;
                }
            }
        }
        Queue<int[]> q = new LinkedList<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (!copyvisited[i][j]){
                    q.add(new int[] {i,j});
                    count++;
                }

                while (!q.isEmpty()) {
                    int[] temp = q.poll();
                    int x = temp[0];
                    int y = temp[1];
                    copyvisited[x][y]=true;

                    for (int k=0; k<4; k++) {
                        int nx = x+dx[k];
                        int ny = y+dy[k];
                        if (nx>=0 && ny>=0 &&nx<n &&ny<n && !copyvisited[nx][ny]) {
                            copyvisited[nx][ny]=true;
                            q.add(new int[] {nx,ny});
                        }
                    }
                }

            }
        }
        return count;



    }
}

