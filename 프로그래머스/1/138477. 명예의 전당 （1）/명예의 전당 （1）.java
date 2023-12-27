//매일 1명씩 점수 매김 k까지,  "명예의 전당"의 최하위 점수
import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> arr = new PriorityQueue<>();
        for (int i=0; i<score.length; i++) {
            if (arr.size()<k) {
                arr.add(score[i]);}
            else {
                if (arr.peek()<score[i]) {
                    arr.poll();
                    arr.add(score[i]);
                }
            }
            answer[i]=arr.peek();
        }
        
        return answer;
    }
}