import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static ArrayList<ArrayList<int[]>> mapp;
    static int n;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //n개의 노드
        int m = Integer.parseInt(st.nextToken()); //거리를 알고싶은 쌍
        //행렬로 풀면 쉬울듯

        mapp = new ArrayList<>();

        for (int i=0; i<=n; i++) {
            mapp.add(new ArrayList<>());
        }

        for (int i=0; i<n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance= Integer.parseInt(st.nextToken());

            mapp.get(start).add(new int[] {end,distance});
            mapp.get(end).add(new int[] {start,distance});

        }

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            boolean[] visited= new boolean[n+1];
            int ans = bfs(start, end, visited);
            System.out.println(ans);
        }
    }

    public static int bfs(int x, int y, boolean[] visited ) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,0}); // 1
        visited[x]=true;
        int ans =0;
        while (!q.isEmpty()) {
            int[] temp = q.poll(); //1
            if (temp[0] == y) {
                ans = temp[1];
                return ans;
            }
            for (int[] node : mapp.get(temp[0])) {
                if (!visited[node[0]]) {
                    q.add(new int[] { node[0], node[1]+temp[1]});
                    visited[temp[0]] = true;

                }
            }
        }
        return ans;
    }

}
