import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int n;
    static  int[][] mapp;
    static int plus, minus, zero;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        mapp = new int[n][n];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                mapp[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0,n); //행,열, size

        System.out.println(minus);
        System.out.println(zero);
        System.out.println(plus);
    }

    public static void dfs(int row, int col, int size) {
        if (equalcheck(row, col, size)) {
            //만약 범위 내의 모든 수들이 같은 수라면
            if (mapp[row][col]==-1) {
                minus++;
            }
            else if (mapp[row][col]==1) {
                plus++;
            }
            else {
                zero++;
            }
            return;
        }
        int newsize = size/3;
        //아니라면 범위를 좁혀야 함
        //자른다고 생각하지 않고, 범위를 나눈다고 생각해보자(dfs는 체크하는 함수)
        // 그러면, 처음 시작 행열에서 얼마만큼의 범위를 체크할건지 결정하면 된다
        dfs(row, col, newsize); //왼쪽 위
        dfs(row, col+newsize, newsize); //왼쪽 가운데
        dfs(row, col+2*newsize, newsize); //오른쪽 위

        dfs(row+newsize, col, newsize);
        dfs(row+newsize, col+newsize, newsize);
        dfs(row+newsize, col+2*newsize, newsize);

        dfs(row+2*newsize, col, newsize);
        dfs(row+2*newsize, col+newsize, newsize);
        dfs(row+2*newsize, col+2*newsize, newsize);

    }

    private static boolean equalcheck(int row, int col, int size) {
    //각 시작점부터 시작해서 size만큼이 모두 같은 색깔이면 true
        int color = mapp[row][col];

        for (int i=row; i<row+size; i++) {
            for (int j=col; j<col+size; j++) {
                if (mapp[i][j]!=color) {
                    return false;
                }
            }
        }
        return true;

    }
}
