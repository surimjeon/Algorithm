import java.util.*; 
class Solution {
    static Stack<Integer> st = new Stack<>();
    static int answer = 0;
    public int solution(int[][] board, int[] moves) {
        
        for (int i=0; i<moves.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                // System.out.println(board[j][moves[i]-1]);
                if (board[j][moves[i]-1]!=0) {
                    check(board[j][moves[i]-1]);
                    board[j][moves[i]-1]=0;
                    break;
                }
            }
            
        }
        
        
        return answer*2;
    }
    public static void check(int num) {
        if (st.isEmpty()) {
            st.add(num);
        }
        else {
            if (st.peek()==num) {
                st.pop();
                answer++;
            }
            else {
                st.add(num);
            }
        }
    }
}