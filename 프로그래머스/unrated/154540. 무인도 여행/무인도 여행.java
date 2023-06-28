import java.util.*;
class Solution {
    static char[][] mapp;
    static boolean[][] visited;
    static int n,m; 
    static List<Integer> answer;
    public int[] solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();
        mapp= new char[n][m];
        visited= new boolean[n][m];
        answer = new ArrayList<>();
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                mapp[i][j]=maps[i].charAt(j);
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (mapp[i][j]!='X' && visited[i][j]==false) {
                    bfs(i,j);
                }
            }
        }
        
        if (answer.isEmpty()) {
            return new int[]{-1};
        }
        else { //정렬 후 새로운 배열에 담아줘야한다 
            Collections.sort(answer);
            int[] ans = new int[answer.size()];
            for (int i=0; i<answer.size(); i++) {
                ans[i]=answer.get(i);
            }
        return ans;
        }
    }
    
    public static void bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        int[] dx = new int [] {-1,0,1,0};
        int[] dy = new int [] {0,-1,0,1};
        int cnt = mapp[i][j]-'0';
        
        q.add(new int[] {i,j});
        visited[i][j]=true;
        
        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int x = temp[0];
            int y = temp[1];
            
            for (int k=0; k<4; k++) {
                int nx = x+dx[k];
                int ny = y+dy[k];
                if (nx>=0 && nx<n && ny>=0 && ny<m) {
                    if (visited[nx][ny]==false && mapp[nx][ny]!='X') {
                        q.add(new int[] {nx,ny});
                        visited[nx][ny]=true;
                        cnt+=mapp[nx][ny]-'0';
                    }
                }
            }
        }
        answer.add(cnt);
    }
}