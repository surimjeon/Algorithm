class Solution
{
    public int solution(int [][]board)
    {
        int answer=0;
        //1부터 시작하기 때문에 왼쪽 상단, 상단, 왼쪽을 비교하면서 +1씩 쌓아간다
        int row = board.length;
        int col = board[0].length;
        
        if(row<2 || col<2) {
            return 1;
        }
        
        //1부터 시작하면서 왼쪽상단, 왼쪽, 상단을 체크하면서 아래로 뻗어내려 감
        for (int i=1; i<row; i++) {
            for (int j=1; j<col; j++) {
                if (board[i][j]==1){
                    board[i][j]=Math.min(Math.min(board[i-1][j-1], board[i-1][j]), board[i][j-1])+1;
                }
             answer= Math.max(answer, board[i][j]);
            }
        }
        
        
        return answer*answer;
    }
}