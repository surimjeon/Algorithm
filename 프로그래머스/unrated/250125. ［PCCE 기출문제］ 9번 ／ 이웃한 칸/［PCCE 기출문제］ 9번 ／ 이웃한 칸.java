// 4방에서 같은 색으로 칠해진 칸의 개수
class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dx = new int[] {-1, 0, 1, 0};
        int[] dy = new int[] {0, -1, 0, 1};
        
        for (int i=0; i<4; i++) {
            if (h+dx[i]>=0 && h+dx[i]<board.length && w+dy[i]>=0 && w+dy[i]<board.length) {
                if (board[h][w].equals(board[h+dx[i]][w+dy[i]])) answer++;
            }
        }
        return answer;
    }
}