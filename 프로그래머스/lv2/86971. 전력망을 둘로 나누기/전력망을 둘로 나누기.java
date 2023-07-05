import java.util.*;
class Solution {
    static int[][] arr;
    public int solution(int n, int[][] wires) {
        arr = new int[n+1][n+1];
        int ans = Integer.MAX_VALUE;
        
        //인접행렬 표시
        for (int i=0; i<wires.length; i++) {
            arr[wires[i][0]][wires[i][1]]=1;
            arr[wires[i][1]][wires[i][0]]=1;
        }
        //선하나씩 끊으면서 (left,right) bfs탐색
       for (int i=0; i<wires.length; i++) {
            int left = wires[i][0];
            int right = wires[i][1];
           
            arr[left][right]=0;
            arr[right][left]=0; //양방향이기 떄문에 둘다 끊기
            ans = Math.min(ans,bfs(n,left)); //차이가 적도록
            arr[left][right]=1;
            arr[right][left]=1;
       }
        
        return ans;
    }
    public static int bfs(int n, int from) {
        //cnt세기
        // 한줄씩 visited체크
        int cnt = 1;
        boolean [] visited = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(from); //시작을 넣고, 그 시작점과 모두 연결되어있는 것  체크     
        
        while(!q.isEmpty()) {
            int temp = q.poll();
            visited[temp]=true;
            for (int i=1; i<n+1; i++) {
                if (arr[temp][i]==1 && !visited[i]) {
                    q.add(i); //다음노드 저장
                    cnt++; //연결된 개수
                }
            }
        }
        return Math.abs(cnt-(n-cnt)); //cnt와 나머지(n-cnt)연결의 차이
        
    }
}