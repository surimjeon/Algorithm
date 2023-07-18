import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        //세로 좌표, 가로 좌표 .빈칸, #파일, 
        //(0,1), (1,2),(2,3) -> 0 ~2+1 / 1~ 3  +1 x,y의 젤 큰수들 위주로
        int lux=50, luy=50, rdx=0, rdy=0;
        for (int i=0; i<wallpaper.length; i++) {
            //i가 행, j가 열
            String temp = wallpaper[i];
            for (int j=0; j<temp.length(); j++) {
                if (temp.charAt(j)=='#') {
                    lux = Math.min(i, lux);
                    luy = Math.min(j, luy);
                    rdx = Math.max(i, rdx);
                    rdy = Math.max(j, rdy);
                }
            }
        }
        int[] answer = new int[] {lux, luy, rdx+1, rdy+1};
        return answer;
    }
}