import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int n;
    static int[] arr;
    static boolean[] visited;
    static ArrayList<Integer> list;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 정수를 많이 뽑는 방법(집합이 일치)
        // 많은 숫자들부터 모든 조합을 해서, 같은 집합이 있으면,
        // 정수 개수와 작은 수->큰수 순서

        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        visited = new boolean[n+1];

        for (int i=1; i<n+1; i++) {
            arr[i]= Integer.parseInt(br.readLine());
        }
        //정답배역만들기(모든 사이클이 있는 요소)
        list = new ArrayList();

        //dfs -> visited[i]=true로 했다가
        //사이클이 발생했는지 dfs로 확인
        for (int i=1; i<=n; i++) {
            dfs(i,i);
            visited[i]=false;
        }

        Collections.sort(list);

        System.out.println(list.size());

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

    //모든 조합을 구하기 위함
    public static void dfs(int idx, int num) { //목표값까지 모든 수열 확인
        visited[idx]=true;
        if (!visited[arr[idx]]) { //y가 방문하지 않았다면,
            visited[arr[idx]]=true;
            dfs(arr[idx], num);
            visited[arr[idx]]=false;
        }
        if (arr[idx]==num) list.add(arr[idx]);
    }

}
