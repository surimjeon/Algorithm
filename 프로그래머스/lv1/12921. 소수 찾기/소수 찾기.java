import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        
        //값 세팅
        arr[0]=arr[1]=0;
        for (int i=2; i<=n; i++) {
            arr[i]=i;
        }
        
    
        //0이 아니면(소수이면), 숫자그대로
        for (int i=2; i<Math.sqrt(n); i++) {
            if (arr[i]==0) continue;
            for (int j=i*i; j<=n; j+=i) { //i*i =즉 배수부터 지워나가기 시작
                arr[j]=0;
            }
        }
        
        for (int i=0; i<=n; i++) {
            if (arr[i]!=0) {
                answer++;
            }
        }        
        
        
        return answer;
    }
}