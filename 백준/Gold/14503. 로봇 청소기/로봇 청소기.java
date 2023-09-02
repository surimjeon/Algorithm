import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    static int N,M;
    static int[][] mapp;
    static int answer;
    static int[] dx = new int[] {-1, 0, 1, 0}; //북동남서
    static int[] dy = new int[] {0, 1, 0, -1};

    public static void main(String[] args) throws Exception{
        // 방 크기 N,M이 입력
        // 현재 칸 좌표(i,j), d(방향) 0:북쪽, 1:동쪽, 2: 남쪽, 3:서쪽
        // N개의 줄에 0은 청소되지 X, 1은 벽이 있는 것
        // 청소하는 칸 수는??
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        mapp = new int[N][M];

        answer=1;
        st = new StringTokenizer(br.readLine());

        int r= Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++) {
                mapp[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        direction(r,c,d);
        System.out.println(answer);
    }

    public static void direction(int r, int c, int dir) {
        mapp[r][c]=2;

       for (int i=0; i<4; i++) {
           dir = (dir+3)%4;
           int nx = r + dx[dir]; //dir은 항상 4방향 모두로 -하면서 움직임
           int ny = c + dy[dir];
        //청소되지 않는 칸이 있으면 회전하고 청소
           if (0<=nx && nx<N && 0<=ny &&ny<M) {
               if (mapp[nx][ny]==0) {
                   answer++;
                   direction(nx, ny, dir);
                   return;
                   }
               }
           }
        //청소되지 않은 빈칸이 없으면 후진하고 원래 방향으로 전진
        int new_dir = (dir+2)%4;

       int nx = r + dx[new_dir];
       int ny = c + dy[new_dir];

       if (0<=nx && nx<N && ny>=0 && ny<M && mapp[nx][ny]!=1) { //후진하는 코드
            direction(nx,ny,dir); //바라보는 방향을 유지할 수 있다면
       }
   }

}

