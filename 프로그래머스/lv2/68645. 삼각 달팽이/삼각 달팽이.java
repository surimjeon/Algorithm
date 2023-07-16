class Solution {
    public int[] solution(int n) {
        if (n==1) {return new int []{1};}
        int [][] mapp = new int[n][n];
        int sum =(n*(n+1))/2;
        int idx = 1;
        int x = -1;
        int y=0; 
        
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(i%3==0){
                    x++;
                }
                else if(i%3==1){
                    y++;
                }
                else {
                    x--;
                    y--;
                }
                mapp[x][y]=idx++;
            }
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