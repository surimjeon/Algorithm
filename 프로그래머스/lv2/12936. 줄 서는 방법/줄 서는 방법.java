import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        long factorial=1;
        int idx =0;
        
        for (int i=1; i<=n; i++) {
            factorial*=i;
            list.add(i); //1번부터 n번사람까지 저장
        }
        k--;
        while (n>0) { //사람수만큼 정답을 채웠을 떄
            factorial/=n; //각 그룹의 경우의 수(개수) 6 2 
            int val = (int) (k/factorial); //k번째는 몇번쨰 그룹인지 보고, 그 그룹의 번호(2)가 ans[idx]에 들어가는 수이다
            answer[idx] = list.get(val);
            list.remove(val); //2는 제거, 그럼 0번쨰는 1, 1번쨰는 2가 됨
            k%=factorial; //13%6 = 1
            idx++; //다음 idx 
            n--; //n은 -1;
            
        }
        return answer;
        
    }
}