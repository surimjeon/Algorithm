import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int[][] mapp;
    static boolean[][] visited;
    static int m,n;
    static int[] dx ={-1,0,1,0};
    static int[] dy ={0,-1,0,1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();
        mapp= new int[n][m];
        visited= new boolean[n][m];

        for (int i=0; i<k; i++) {
            st = new StringTokenizer(br.readLine());
            int y1 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            // (5,7)
            for (int j=x1; j<x2; j++) {
                for (int l=y1; l<y2; l++) {
                    mapp[j][l]=-1;
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (mapp[i][j]==0 && !visited[i][j]) {
                    int width = bfs(i,j);
                    arr.add(width);
//                    System.out.println(i+" "+j);
                }
            }
        }
        //arr의 개수를 세리고, 그걸 int[]배열로 바꾸기
        System.out.println(arr.size());
        int[] ans = new int[arr.size()];

        for (int i=0; i< arr.size(); i++) {
            ans[i]= arr.get(i);
        }
        Arrays.sort(ans);

        for (int i=0; i< arr.size(); i++) {
            System.out.print(ans[i]+" ");
        }



    }

    public static int bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {i,j});
        visited[i][j]=true;
        int count = 1;

        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int x = temp[0];
            int y = temp[1];
            for (int a=0; a<4; a++) {
                int nx = x+dx[a];
                int ny = y+dy[a];

                if (nx>=0 && nx<n &&ny>=0 && ny<m) {
                    if (mapp[nx][ny]==0 && !visited[nx][ny]) {
                        q.add(new int[] {nx,ny});
                        visited[nx][ny]=true;
//                        System.out.println(nx+" "+ny);
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
