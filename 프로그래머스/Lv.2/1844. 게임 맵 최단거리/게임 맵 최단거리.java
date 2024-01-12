// 지나가야하는 칸 개수의 최소값 (지도에다 표시), 0은 벽, 1은 길
// (1,1)자리에 있고, 도착점은 (n,m)임
import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int[] dx = new int[] {-1,0,1,0};
        int[] dy = new int[] {0,-1,0,1};
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        
        q.add(new int[] {0,0});
        visited[0][0]=true;
        
        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int x = temp[0];
            int y = temp[1];
            for (int i=0; i<4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx>=0 && ny>=0 && nx<n && ny<m) {
                    if (!visited[nx][ny] && maps[nx][ny]==1) {
                        maps[nx][ny]=maps[x][y]+1; 
                        visited[nx][ny]=true;
                        q.add(new int[] {nx,ny});
                    }
                }
            }
        }
        
        int answer = maps[n-1][m-1];
        if (answer==1) answer=-1;
        
        return answer;
    }
}