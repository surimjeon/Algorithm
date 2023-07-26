import java.util.*;
class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for (int i=0; i<5; i++) {
            String[] temp = places[i]; //문자열 * 5개
            boolean ans = true;
            
            for (int j=0; j<5 && ans; j++) {
                for (int k=0; k<5 && ans; k++) {
                    if(temp[j].charAt(k)=='P') {
                        if (!bfs(j,k,temp)) {
                            ans=false;
                        }
                    }
                }
            }
            if (ans) {answer[i]=1;}
        }
        return answer;
    }
    
    public static boolean bfs(int r, int c, String[] st) {
        int[] dx = new int[] {-1,0,1,0};
        int[] dy = new int[] {0,-1,0,1};
        
        Queue<int[]> q = new LinkedList<int[]>();
        q.offer(new int[] {r,c});
        
        while (!q.isEmpty()) {
            int[] rc=q.poll();
            int x = rc[0];
            int y=rc[1];
            for (int i=0; i<4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx<0 || nx>=5 || ny<0 || ny>=5 ||(nx == r && ny == c)) {
                    continue;
                }
                int d = Math.abs(nx-r)+Math.abs(ny-c);
                
                if(d<=2 && st[nx].charAt(ny)=='P') {
                    //사람이 있으면
                    return false; 
                }
                else if (d<2 && st[nx].charAt(ny)=='O') {
                    q.add(new int[] {nx,ny});
                }
            }
        }
        return true;
        
    }
}