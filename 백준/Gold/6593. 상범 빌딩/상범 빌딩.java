import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// 2개로 나눈팀의 합의 차이가 가장 작은 경우의 차이 구하기
//모든 조합 경우의 수를 구하는 문제 => 백트래킹으로 모든 조합구하기

public class Main {
    static int l,r,c;
    static int[] dx = new int[] {-1, 0, 1, 0, 0, 0};
    static int[] dy = new int[] {0, -1, 0, 1, 0, 0};
    static int[] dz = new int[] {0, 0, 0, 0, 1, -1};
    static StringTokenizer st;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //각 변의 길이가 1인 정6면체 L: 층수, R: 행, C: 열
        // 지나갈 수 없는 칸 #, 비어있는 칸 . , 시작 S, 출구 E
        // 0 0 0 => 종료

        while (true) {
            st = new StringTokenizer(br.readLine());

            l = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if (l==0 && r==0 && c==0){
                break;
            }

            char[][][] arr = new char[l][r][c];
            int[][][] visited = new int[l][r][c];
            for (int i=0; i<l; i++) {
                for (int j=0; j<r; j++) {
                    String temp = br.readLine();
                    for (int k=0; k<c; k++) {
                        arr[i][j][k]=temp.charAt(k);
                    }
                }
                br.readLine();
            }

            String ans = bfs(arr, visited);
            System.out.println(ans);
//            for (int i=0; i<l; i++) {
//                for (int j=0; j<r; j++) {
//                    for (int k=0; k<c; k++) {
//                        System.out.print(arr[i][j][k]);
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }



        }

    }

    public static String bfs(char[][][] arr, int[][][] visited) {
        //탈출할 수 있으면 출력
        int ex=0, ey=0, ez=0;
        Queue<int[]> q = new LinkedList<>();
        for (int i=0; i<l; i++) {
            for (int j=0; j<r; j++) {
                for (int k=0; k<c; k++) {
                    if (arr[i][j][k]=='S') {
                        q.add(new int[] {i,j,k});
                        visited[i][j][k]=1;
                    }
                    if (arr[i][j][k]=='E') {
                        ez =i;
                        ex =j;
                        ey = k;
                    }
                }
            }
        }


        while (!q.isEmpty()) {
            int[] loc = q.poll();
            int z = loc[0];
            int x = loc[1];
            int y = loc[2];

            for (int k=0; k<6; k++) {
                int nx = x+dx[k];
                int ny = y+dy[k];
                int nz = z+dz[k];

                if (nx>=0 && nx<r && ny>=0 && ny<c && nz>=0 && nz<l) {
                    if (arr[nz][nx][ny] != '#' && visited[nz][nx][ny] == 0) {
                        q.add(new int[]{nz, nx, ny});
                        visited[nz][nx][ny] = visited[z][x][y] + 1;
                    }
                }
            }
        }


        if (visited[ez][ex][ey]!=0) {
            int ans = visited[ez][ex][ey]-1;
            return "Escaped in " + ans + " minute(s).";
        }
        else {
            return "Trapped!";
        }

    }

}