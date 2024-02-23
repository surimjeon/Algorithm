// 통로로만 이동 가능, 레버를 당긴 후 빠져나가는 칸으로 이동(이동은 가능)
// 최대한 미로를 빠져나가는 데 걸리는 시간, 안되면 -1
import java.util.*;
class Solution {
    static int n,m;
    static int[] dx = new int[] {-1,0,1,0};
    static int[] dy = new int[] {0,1,0,-1};
    
    public int solution(String[] maps) {
        int answer = 0;
        n = maps.length;
        m = maps[0].length();
        // 시작에서 레버까지 최소, 레버에서 exit까지 최소인 곳을 최소
        char[][] map = new char[n][m];
        for (int i=0; i<n; i++) {
            String temp = maps[i];
            for (int j=0; j<m; j++) {
                map[i][j]=temp.charAt(j);
            }
        }
        
        int start=bfs(map, 'S', 'L');
        int end=bfs(map, 'L', 'E');
        // System.out.print(start);
        // System.out.print(end);
        
        if (start ==0 || end==0) return -1;
        answer = start + end;
        
        return answer;
    }
    static int bfs(char[][] maps, char s, char e) {
        int sx=0, sy=0, ex=0, ey=0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (maps[i][j]==s) {
                    sx = i; sy = j;
                }
                if (maps[i][j]==e) {
                    ex = i; ey = j;
                }
            }
        }
        
        int[][] mapp = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        
        visited[sx][sy]=true;
        q.add(new int[] {sx, sy});
        
        
        while(!q.isEmpty()) {
            int[] temp = q.poll();
            int x = temp[0];
            int y = temp[1];
            
            for (int i=0; i<4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx>=0 && nx<n && ny>=0 && ny<m) {
                  if (maps[nx][ny]!='X' && !visited[nx][ny]) {
                      q.add(new int[] {nx,ny});
                      visited[nx][ny]=true;
                      mapp[nx][ny]+=(mapp[x][y]+1);
                  }
                    if (nx==ex && ny==ey) break;
                }
            }
        }
        return mapp[ex][ey];
        
    }
}