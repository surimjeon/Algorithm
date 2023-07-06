import java.util.*;
class Solution {
    public String solution(int n, int t, int m, int p) {
        //n:진법, t:말해야하는 숫자 개수, m: 게임참가인원, p: 튜브 순서
        //0 1 10 11 1 //숫자개수*참가인원
        // t*m 최대, 문자열 합치기(StringBuilder사용)
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        
        for (int i=0; sb.length()<=t*m; i++) {
            sb.append(Integer.toString(i,n));
        } //sb에다가 진법 변환한 숫자를 저장함
        
        for (int i=p-1; i<t*m; i+=m) { //4개일때까지
            answer.append(sb.charAt(i));
        }
        
        
        return answer.toString().toUpperCase();
    }
}