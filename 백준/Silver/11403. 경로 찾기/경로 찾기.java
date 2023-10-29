import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int[][] arr, path;
    static boolean[] visited;
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //인접행렬로 dfs만들기

        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        visited = new boolean[n];
        path = new int[n][n];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                arr[i][j]= Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                visited[j] = false; //모든 열 초기화
            }

            for (int j=0; j<n; j++) {
                if (arr[i][j]==1 && !visited[j]) {
                    dfs(i,j); // 있으면, 탐색하기
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(path[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void dfs(int i, int j) {
        visited[j]=true; //방문체크
        path[i][j]=1; // 정답체크

        for (int l=0; l<n; l++) {
            if (arr[j][l]==1 && !visited[l]) { //타고 들어갈 곳이 있고, 그 열은 방문하지 않았다면
                dfs(i,l); // 기준 행과 연결되어있으면 표시
            }
        }





    }

}
