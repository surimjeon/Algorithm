//시작위치에서 목표위치까지 몇번만에 도달할 수 있는지 .빈공간, R: 로봇처음위치, D장애물위치, G:목표지점 , 장애물이 있는 곳/끝 에서 방향을 꺾을수있고, 도달할 수 없으면 -1
//bfs에서 한칸을 움직이지 않고, d나 끝이 오기전에 그만둔다 = 최소값을 큐에넣어놓으면서 갱신시킨다
import java.util.*;

class Solution {
    static boolean[][] visited;
    static int n,m, sx, sy; 
    static int[] dx = new int[]{-1, 0, 1, 0};
    static int[] dy = new int[]{0, -1, 0, 1};
    static int answer = Integer.MAX_VALUE;
    
    public int solution(String[] board) {
        n = board.length;
        m = board[0].length();
        
        visited = new boolean[n][m];
        
        sx =0; sy =0;
        for (int i=0; i<n; i++) {
            String temp = board[i];
            for (int j=0; j<m; j++) {
               if (temp.charAt(j)=='R') {
                    sx = i; sy = j;
                }
            }
        }
        
        answer = bfs(board);
        
        return answer;
    }
    public static int bfs(String[] board) {
        Queue<int[]> q = new LinkedList<>(); 
        visited[sx][sy]=true;
        q.add(new int[] {sx,sy, 0}); // count더 작은거 답을 구하기 위해
        
        while (!q.isEmpty()) {
            int[] temp=q.poll();
            int x = temp[0];
            int y = temp[1];
            int count = temp[2];
            // if (answer <= count) continue; // 더 작은 값이 있으면 지나친다
            
            //answer과 count중에 작은 걸 정답으로 
            if (board[x].charAt(y)=='G') {
                answer = Math.min(answer, count);
                continue;
            }
            
            for (int k=0; k<4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                //방향이 잘못된 부분은 뛰어넘기
                if (nx>=0 && nx<n && ny>=0 && ny<m) {
                    if (board[nx].charAt(ny)!='D') {
                        while (nx>=0 && ny>=0 && nx<n && ny<m && board[nx].charAt(ny)!='D') {
                            nx+=dx[k];
                            ny+=dy[k];
                        }
                        nx-=dx[k];
                        ny-=dy[k];
                        if (!visited[nx][ny]) {
                            visited[nx][ny]= true;
                            q.add(new int[] {nx, ny, count+1});
                        }
                    }
                }
            }
        }
        return answer==Integer.MAX_VALUE? -1 : answer;
    }
     
}