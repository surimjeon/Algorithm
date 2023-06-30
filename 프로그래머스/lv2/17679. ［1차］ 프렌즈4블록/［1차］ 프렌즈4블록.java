import java.util.*;
class Solution {
    static boolean [][] visited;
    static char[][] mapp;
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        mapp= new char[m][n];
        
        for (int i=0; i<m; i++) {
            mapp[i]=board[i].toCharArray();
        } //배열안에 다 집어 넣기
        
        boolean flag = true;
        while (flag) {
            flag = false;
            visited = new boolean[m][n];
            
            for (int i=0; i<m-1; i++) {
                for (int j=0; j<n-1; j++) {
                    if (mapp[i][j]=='#') continue; //빈칸이라면 계속하기
                    if (check(i,j,mapp)) {
                        visited[i][j]=true;
                        visited[i+1][j]=true;
                        visited[i][j+1]=true;
                        visited[i+1][j+1]=true;
                        flag=true;
                    }
                }
            }
            answer+=remove(mapp, m,n);
        }
        return answer;
    }
    //2*2에 나랑 동일한게 있는지 확인하는 함수
    public static boolean check(int x, int y, char[][] board) {
        char temp = board[x][y];
        if (temp == board[x+1][y] && temp==board[x][y+1] && temp==board[x+1][y+1]) {
            return true; }
        return false;
    }
    
    public static int remove(char[][] mapp, int m, int n) {
        int cnt =0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (visited[i][j]) { //방문한 곳은 .을 찍어서 표시
                    mapp[i][j]='.';
                }
            }
        }
        //세로한줄씩 큐에다가 .이 아니면 넣고, 빼기 ...그리고, 남은 인덱스만큼은 빈칸으로 채워주기
        for (int i=0; i<n; i++) { //세로로 한줄씩 비교
            Queue<Character> q = new LinkedList<>();
            for (int j=m-1; j>=0; j--) {
                if (mapp[j][i]=='.') {
                    cnt++; // 지웠다면 cnt+1 
                }
                else {
                    q.add(mapp[j][i]);
                }
            }
            //한줄씩 큐에 담고, 빼면서 채워넣기
            int idx=m-1;
            while (!q.isEmpty()) {
                mapp[idx--][i]=q.poll(); //idx를 -1씩하면서 q에다가 넣기
            }
            for (int k=idx; k>=0; k--) {
                mapp[k][i]='#';
            }
        }
        return cnt;
    }
    
}