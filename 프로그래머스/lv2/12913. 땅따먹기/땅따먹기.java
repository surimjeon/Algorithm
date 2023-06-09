import java.util.*;

//DP의 전형적 문제
//탐욕법을 쓰는 경우, 다음줄에서 더 큰 숫자의 기회를 잃을 수 있기 때문에 실패
// DFS, BFS는 범위(100000)로 시간초과일 수 있고, 굳이..?
// for문으로 다음 숫자만 고려할 수 있음 -> 연쇄적으로 최대값을 고르는것이 어려울 수 있음
//DP: 복잡한 문제를 간단한 여러개의 문제로 나누어 푸는 방법

class Solution {
    int solution(int[][] land) {
        int answer = 0; //최대값 
        
        for (int i=1; i<land.length; i++) {
            land[i][0]+=Math.max(Math.max(land[i-1][1], land[i-1][2]),land[i-1][3]);
                land[i][1]+=Math.max(Math.max(land[i-1][0], land[i-1][2]),land[i-1][3]);
                land[i][2]+=Math.max(Math.max(land[i-1][1], land[i-1][0]),land[i-1][3]);
                land[i][3]+=Math.max(Math.max(land[i-1][1], land[i-1][2]),land[i-1][0]);
        }
        answer = max(land[land.length-1]);
        return answer;
    }
    public int max(int[] arr ) {
        int mx =0;
        for (int num: arr) {
            mx=Math.max(mx, num);
        }
        return mx;
    }
}