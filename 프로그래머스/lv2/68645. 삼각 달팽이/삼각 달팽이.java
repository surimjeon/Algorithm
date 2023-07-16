class Solution {
    public int[] solution(int n) {
        if (n==1) {return new int []{1};}
        int [][] mapp = new int[n][n];
        int sum =(n*(n+1))/2;
        int idx = 1;
        int x =0;
        int y=0; 
        int turn =n;
        while (idx<=sum) {
            //아래
            for (int i=0; i<turn; i++) {
                mapp[x++][y]=idx++;
            }
            x--;
            turn--;
            y++;
            
            // 오른쪽
            for (int j=0; j<turn; j++) {
                mapp[x][y++]=idx++;
            }
            y--; //열 안넘치게
            turn--;
            x--; //다음 차례 준비
            y--;
            
            //위쪽
            for (int j=0; j<turn; j++) {
                mapp[x--][y--]=idx++;
            }
            x++;
            turn--;
            x++;
            y++;
        }
        
        int n_idx = 0;
        int[] answer = new int[sum];
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (mapp[i][j]!=0) {
                    answer[n_idx]=mapp[i][j];
                    n_idx++;
                }
            }
        }
        
        return answer;
    }
}