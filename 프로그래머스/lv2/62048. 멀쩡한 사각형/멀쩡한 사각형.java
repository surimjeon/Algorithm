import java.util.*;
class Solution {
    public long solution(int w, int h) {
        Long width = Long.valueOf(w);
        Long height = Long.valueOf(h);
        
        long answer = width*height - (width+height-check(width,height));
        return answer;
        
    }
    public static long check(long w, long h) {
        long min =w; //나눌 수
        long max =h; //나눌 수
        
        if (h<w) {
            max=w;
            min=h;
        }
        
        long temp = 0;
        while (min>0) {
            temp = max%min; //4
            max = min; //8
            min = temp; //4
        }
     return max;
    }
}