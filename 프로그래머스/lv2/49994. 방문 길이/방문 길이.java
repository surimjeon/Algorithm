class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, -1, 0, 1};
        
        boolean [][][] visited = new boolean[11][11][4];
        //방문하지 않은 '점'이 아니라 '길'이기 때문에 어느방향에서 왔는지 생각해줘야함
        
        int y=5, x=5;
        int d=0; 
        for (int i=0; i<dirs.length(); i++) {
            char now = dirs.charAt(i);
            if (now=='U') d=0; 
            else if(now=='L') d=1;
            else if (now=='D')  d=2;
            else if (now=='R') d=3;
            
            int nx = x+dx[d];
            int ny = y+dy[d];
            
            if (nx<0 || nx>10 || ny<0 || ny>10) {
                continue;
            }
            
            if (!visited[nx][ny][d]) {
                visited[nx][ny][d]=true;
                answer++;
                //반대방향으로 오는 것도 체크해줘야 더블 체크가 되지 않음
                d= (d%2==0)? 2-d : 4-d;
                visited[x][y][d]=true;
            }
            x=nx;
            y=ny;
            
        }
        //단어 하나씩 체크 =>(5,5)에서 시작..?  10*10행렬만들기
        //x,y표시, 만약에 x,y가 범위를 벗어나면, continue
        // visited표시 true, cnt++; 
        
        return answer;
    }
}