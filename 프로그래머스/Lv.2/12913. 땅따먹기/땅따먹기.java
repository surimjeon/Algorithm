// dp문제로 풀기 - 100000개까지 돌아가며, 열은 4개밖에 되지 않기 때문에..! 
import java.util.*;
class Solution {
    int solution(int[][] land) {
        int n = land.length;
        for (int i=0; i<n-1; i++) {
            land[i+1][0] += Math.max(Math.max(land[i][1], land[i][2]), land[i][3]);
            land[i+1][1] +=  Math.max(Math.max(land[i][0], land[i][2]), land[i][3]);
            land[i+1][2] +=  Math.max(Math.max(land[i][1], land[i][0]), land[i][3]);
            land[i+1][3] +=  Math.max(Math.max(land[i][0], land[i][2]), land[i][1]);     
        }
        int answer = Math.max(Math.max(land[n-1][1], land[n-1][0]),Math.max(land[n-1][2], land[n-1][3]));
        return answer;
    }   
}