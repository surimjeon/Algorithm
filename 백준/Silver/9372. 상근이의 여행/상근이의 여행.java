import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        // 최대한 적은 종류 비행기를 타고 모든 국가이동
        //연결그래프를 그리고, 모든 노드가 체크되는 최소한의 횟수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n =Integer.parseInt(st.nextToken());
            int m =Integer.parseInt(st.nextToken());

            //arr를 만들고, 그 안에 노드를 넣은 arr를 만듬
            ArrayList<ArrayList<Integer>> tree = new ArrayList<>();

            for (int j=0; j<=n; j++) {
               tree.add(new ArrayList<>());
            }

            for (int j=0; j<m; j++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st1.nextToken());
                int b = Integer.parseInt(st1.nextToken());
                tree.get(a).add(b);
                tree.get(b).add(a);
            }

            boolean[] visited = new boolean[n+1];
            //dfs탐색
            int ans = trip(tree,visited,1);
            System.out.println(ans);
        }

    }
    static int trip(ArrayList<ArrayList<Integer>> tree, boolean[] visited, int now) {
        visited[now]=true; //방문체크
        int fly =0;

        for (int nx : tree.get(now)) {
            if (visited[nx]) {
                continue;
            }
            fly += trip(tree, visited, nx)+1;
        }
        return fly;

    }

}