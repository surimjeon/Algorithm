//숫자 식량(며칠동안 머물 수 있는지) - x바다 -> 최대 며칠식(오름차순) 없으면 -1
import java.util.*;
class Solution {
    static int[][] mapp;
    static boolean[][] visited;
    static int[] dx = new int[] {-1,0,1,0};
    static int[] dy = new int[] {0,-1,0,1};
    static int n, m;
    
    public int[] solution(String[] maps) {
        // 맵만들고, 상하좌우 탐색 .. -> bfs
        n = maps.length;
        m = maps[0].length();
        mapp = new int[n][m];
        for (int i=0; i<n; i++) {
            String temp = maps[i];
            for (int j=0; j<m; j++) {
                char a = temp.charAt(j);
                if (a=='X') mapp[i][j]=0;
                else mapp[i][j]=a-'0';
            }
        }
        // bfs탐색하면서 방문하지 않았으면서, 길이 이어질 때까지 최대값을 담기         
        visited = new boolean[n][m];
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (!visited[i][j] && mapp[i][j]!=0) {
                    arr.add(bfs(i,j));
                }
            }
        }
        int[] answer = new int[arr.size()];
        if (arr.size()==0) return new int[] {-1};
        
        for (int i=0; i<arr.size(); i++) {
            answer[i]=arr.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
    public int bfs(int i, int j) {
        int cnt =0;
        visited[i][j]=true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        cnt += mapp[i][j];
        
        while(!q.isEmpty()) {
            int[] temp = q.poll();
            int x = temp[0];
            int y = temp[1];
            for (int k=0; k<4; k++) {
                int nx = x+dx[k];
                int ny = y+dy[k];
                if (nx>=0 && nx<n&& ny>=0 && ny<m) {
                    if (!visited[nx][ny] && mapp[nx][ny]!=0) {
                        q.add(new int[]{nx,ny});
                        visited[nx][ny]=true;
                        cnt+=mapp[nx][ny];
                        
                    }
                }
            }
        }
        return cnt;
        
    }
}