import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) { //스테이지 개수, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지 번호 stages
        //실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열
        int[] answer = new int[N];
        int[] temp = new int[N+1];
        List<double[]> ans = new ArrayList<>();

        for (int i=0; i<stages.length; i++) {
            temp[stages[i]-1]++;
        }
        
        int cnt = stages.length;
        for (int i=0; i<N; i++) {
            if (temp[i]==0) {
                ans.add(new double[] {0,i+1});  
                continue;
            }
            ans.add(new double[] {(double) temp[i]/cnt,i+1});  
            cnt-=temp[i];
        }
        
        ans.sort((a,b)->Double.compare(b[0],a[0]));
        
        for (int i=0; i<ans.size(); i++) {
            answer[i]=(int)ans.get(i)[1];
        }
        
        return answer;
    }
}