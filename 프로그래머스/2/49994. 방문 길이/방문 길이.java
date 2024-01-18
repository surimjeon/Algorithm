// set은 int배열을 다른 객체로 인식함
import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x =0;
        int y =0;
        HashSet<String> set= new HashSet<>();
        for (int i=0; i<dirs.length(); i++) {
            
            int[] nxy = change(dirs.charAt(i), x,y);
            if (nxy[0]<-5 || nxy[0]>5 || nxy[1]<-5 || nxy[1]>5) continue;
            //set이용해서 넣고, 정렬을 해서 변환해서 넣어놓을까?
            int fx = Math.min(nxy[0], x);
            int fy = Math.min(nxy[1], y);
            int nx = Math.max(nxy[0], x);
            int ny = Math.max(nxy[1], y);
            //방향을 고려하지 않으려면.. 
            
            String temp = ""+fx+fy+nx+ny;
            set.add(temp);
            x= nxy[0];
            y=nxy[1];
        }
        answer = set.size();
        
        return answer;
    }
    public int[] change(char ch, int x, int y) {
        if (ch=='U') return new int[]{x-1, y};
        else if (ch=='D') return new int[]{x+1, y};
        else if (ch=='R') return new int[]{x, y+1};
        else return new int[]{x, y-1};
    }
}