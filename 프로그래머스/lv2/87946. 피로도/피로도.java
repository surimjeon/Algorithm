import java.util.*;

class Solution {
    static int mx = Integer.MIN_VALUE;
    static boolean visited[];
    public int solution(int k, int[][] dungeons) {
        //k : 현재 피로도, dungeons: 최소 피로도, 소모 피로도 //던전개수 8개 밖에 안돼
        Arrays.sort(dungeons, (o1,o2)-> { return o2[0]-o1[0];});
        visited = new boolean[dungeons.length];
        
        dfs(k, dungeons,0);
        return mx;
    }
    public static void dfs(int k, int[][] dungeons, int cnt) {
        //전체 던전을 돌면서 하나씩 넣어보고 빼보기
        for (int i=0; i<dungeons.length; i++) {
             //던전의 0번쨰가 현재 k보다 작거나 같고, 방문하지 않았다면 
            if(dungeons[i][0]<=k && visited[i]==false) {
                k-=dungeons[i][1];
                visited[i]=true; // 그렇다면 던전 1번째를 현재 k에서 빼고 방문처리
                dfs(k,dungeons, cnt+1);
                k+=dungeons[i][1];
                visited[i]=false; //k도 넣기, 다시 방문처리 false해주고
            } 
            mx = Math.max(cnt, mx);
        }
    }
}