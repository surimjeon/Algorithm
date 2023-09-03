import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] visited= new int[100001];

    public static void main(String[] args) throws Exception{
        // x수빈 ->걷는다 x-1, x+1
        //순간이동을 한다 2*x의 위치로 간다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int answer = bfs(n,k);
        System.out.println(answer);

    }
    public static int bfs(int n, int k) {
        Queue<Integer> q = new LinkedList<>();

        q.add(n);
        int idx = n;
        visited[idx]=1;

        while (!q.isEmpty()) {
            int now = q.poll();

            if (now==k) {
                return visited[now]-1;
            }
            //방문한적이 없고, 한칸 뒤로가도 괜찮으면
            if (now-1>=0 && visited[now-1]==0) {
                q.add(now-1);
                visited[now-1]=visited[now]+1;
            }
            if (now+1<=100000 && visited[now+1]==0) {
                q.add(now+1);
                visited[now+1] = visited[now]+1;
            }
            if (2*now<=100000 && visited[2*now]==0) {
                visited[2*now] = visited[now]+1;
                q.add(2*now);
            }
        }
        return -1;
    }
}

