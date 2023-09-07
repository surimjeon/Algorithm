import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int[][] mapp;
    static boolean[] visited;
    static int count;
    static int n,m;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        //연결행렬로 각각 int 에 arraylist??
        mapp = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            mapp[u][v]=1;
            mapp[v][u]=1;
        }

        for (int j=1; j<n+1; j++) {
            if (!visited[j]) {
                bfs(j);
                count++;
            }
        }
        System.out.println(count);

    }
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start]=true;

        while (!q.isEmpty()) {
            int node =q.poll();
            for (int i=1; i<n+1; i++) {
                if (mapp[node][i]==1 && !visited[i]) {
                    q.add(i);
                    visited[i]=true;
                }
            }
        }



    }

}


