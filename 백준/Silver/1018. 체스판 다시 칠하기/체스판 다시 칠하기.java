import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;

    static int[] dx = new int[] {-1,0,1,0};
    static int[] dy = new int[] {0,-1,0,1};
    static int mn=Integer.MAX_VALUE;
    static int m, n;
    static char[][] mapp;
    static boolean[][] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //n*n크기 보드에서 8*8크기의 체스판을 만들려고 함->번갈아가면서 색칠
        //8*8크기가 bwbw가 많이 나오는 곳을 찾기
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        mapp = new char[n][m];
        visited = new boolean[n][m];
        for (int i=0; i<n; i++) {
            String temp = br.readLine();
            for (int j = 0; j < m; j++) {
                mapp[i][j] = temp.charAt(j);
                if (mapp[i][j]=='B') visited[i][j]=true;
                else visited[i][j]=false;
            }
        }


        for (int l=0; l<n-7; l++) {
            for (int a=0; a<m-7; a++) {
                check(l,a);
            }
        }
        System.out.println(mn);

    }

    private static void check(int l, int a) {
        int score =0;
        boolean first = visited[l][a]; //한글자한글자 바꾸면서 탐색

        for (int i=l; i<l+8; i++) {
            for (int j=a; j<a+8; j++) {
                if (first!=visited[i][j]) score++;
                first=!first;
            }
            first=!first;
        }

        score = Math.min(score, 64-score);

        mn=Math.min(score,mn);
    }
}
