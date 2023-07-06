class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length;
        int c2= arr2[0].length;
        int c1 = arr1[0].length;
            
        int[][] answer = new int[r1][c2];
        
        for (int i=0; i<r1; i++) { //arr1의 행
            for (int j=0; j<c2; j++) { //arr2의 열
                int temp=0; //arr1의 열과 arr2의 행이 같아야함
                for (int k=0; k<c1; k++) {
                   temp+=arr1[i][k]*arr2[k][j];
                }
                answer[i][j]=temp;
            }
        }
        
        
        return answer;
    }
}