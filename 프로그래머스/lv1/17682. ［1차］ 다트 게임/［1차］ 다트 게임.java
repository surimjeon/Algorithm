import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        //s: 1, d:2, t:3
        //* 점수*2, 바로전 점수*2,(이걸 어떻게 구현해야할까...) 
        //*은 #효과와 중복.=> -2 #=-1
        //다트를 3번던진다에 힌트를 얻자..
        int[] lst = new int[3];
        
        String st ="";
        int idx =0; 
        for(int i=0; i<dartResult.length(); i++) {
            char temp = dartResult.charAt(i);
            switch(temp) {
                 
                case 'S':
                    lst[idx] = (int)Math.pow(Integer.parseInt(st),1);
                    idx++;
                    st ="";
                    break;
                    
                case 'D':
                    lst[idx]=(int)Math.pow(Integer.parseInt(st),2);
                    idx++;
                    st ="";
                    break;
                case 'T':
                    lst[idx]=(int) Math.pow(Integer.parseInt(st),3);
                    idx++;
                    st ="";
                    break; 
                //주의할점은 #,*는 제곱 수할 때 늘렸던 idx를 줄여서 해야함
                case '#':
                    lst[idx-1]*=-1;
                    break;
                 case '*':
                    lst[idx-1]*=2;
                    if (idx>1) { 
                    lst[idx-2]*=2; }
                    break;
                    
                default:
                    st+=String.valueOf(temp);
                    break;
            }
        }
        for (int s:lst) {
            answer+=s;
        }
        
        return answer;
    }
}