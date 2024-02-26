// 가장 큰 정사각형의 넓이
// 위 아래로 몇칸 갈 수 있는지... 왼오로 몇칸?? (중점으로 어디로 갈수 있는지 보고)
import java.util.*;
class Solution{
    public int solution(int[][] board) {
    //정사각형의 정의, 기본적으로 4변이 같야아함 = 왼,위, 대각선이 1이어야 함(근처의 0이 있다면, 가장 최소값은 0이 될거니까 -> 해당 수가 1이면, 최소값 +1이 되는거고, 주변이 모두 1이면, 그 정사각형의 최대값에서 +1씩 하는것)
        int answer = 0;
        int n = board.length;
        int m = board[0].length;
        
        if (n==1 || m==1) return 1;
        
        for (int i=1; i<n; i++) {
            for (int j=1; j<m; j++) {
                if (board[i][j]!=0){
                    board[i][j]=Math.min(Math.min(board[i-1][j], board[i-1][j-1]), board[i][j-1])+1;
                    answer = Math.max(answer, board[i][j]);
                }
            }
        }
        
        return answer*answer;
    }
}