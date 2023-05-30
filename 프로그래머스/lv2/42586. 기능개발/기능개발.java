import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] temp = new int[n];
        
        for (int i=0; i<n; i++) {
            progresses[i]=100-progresses[i];
            temp[i]= (int) Math.ceil((float)progresses[i]/(float)speeds[i]);
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        int release =0; // 배포 개수 
        int cnt = 0; // 현재 배포한 위치
        for (int i=0; i<n; i++){
            if (temp[cnt]<temp[i]) { //처리해야한다면(현재값이 더 크다면)
                arr.add(release);
                cnt=i;
                release = 1;
                if (i+1 == n) {
                    arr.add(release);
                }
            }
            else { //아직 처리되면 안되면
                release+=1;
                if (i+1==n) {
                    arr.add(release);
                }
            }
        }
        
        int[] answer = new int[arr.size()];
        
        for (int i=0; i<arr.size(); i++) {
            answer[i]=arr.get(i).intValue();
        }
        
        return answer;
    }
}