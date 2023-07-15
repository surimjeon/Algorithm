import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        //터진 인형 개수return
        //moves의 j열이라면 해당 숫자 0으로 바꾸고, 해당 숫자를 stack인 바구니에 담는다 => 만약 같은 숫자이면 pop한다
        for (int k=0; k<moves.length; k++) {
            int now = moves[k]-1;
            for (int i=0; i<board.length; i++) {
                if (board[i][now]!=0) {
                    // System.out.println(i+" "+now+" "+board[i][now]);
                    if (st.isEmpty()) {
                        st.push(board[i][now]);
                        board[i][now]=0;
                        break;
                    }
                    if (st.peek() == board[i][now]) {
                        st.pop();
                        board[i][now]=0;
                        answer+=2;
                    }
                    else {    
                        st.push(board[i][now]);
                        board[i][now]=0;
                    }
                break;
                }
            }
        }
        return answer;
    }
}