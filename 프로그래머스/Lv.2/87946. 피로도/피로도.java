// 최소 필요 피로도 높은 것부터.. 80 20 /50 40 /30 10 정렬 해놓고,,,

import java.util.*;
class Solution {
    
    static boolean[] visited; 
    static int max = Integer.MIN_VALUE;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        Arrays.sort(dungeons, (o1,o2)->o2[0]==o1[0]? o2[1]-o1[1]: o2[0]-o1[0]);
        
       visited = new boolean[dungeons.length];
        dfs(k, dungeons,0); //탐험한 동굴 수
        answer = max;
        return answer;
    }
    public static void dfs(int k, int[][] dungeons, int cnt) {
        for (int i=0; i<dungeons.length; i++) {
            if (dungeons[i][0]<=k && !visited[i]) {
                k-=dungeons[i][1];
                visited[i]=true;
                dfs(k, dungeons, cnt+1); //하향식
                visited[i]=false;
                k+=dungeons[i][1];
            }
        }
        max = Math.max(cnt,max);
    }
}