import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        //시작시간~종료시간, 10분청소 필요, 최소객실 수는?
        //큐를 하나씩 생성하면서?// 끝시간을 기준으로 정렬
        int [][] trans = new int[book_time.length][2];
        for (int i=0; i<book_time.length; i++) {
            trans[i][0]=time(book_time[i][0]);
            trans[i][1]=time(book_time[i][1])+10;
        }
        Arrays.sort(trans, (o1, o2)-> o1[0]==o2[0]? o1[1]-o2[1]: o1[0]-o2[0]);
        //시작시간 기준으로, 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(trans[0][1]);
        
        for (int i=1; i<trans.length; i++) {
            if (pq.peek()<= trans[i][0]) {
                pq.poll();
                pq.add(trans[i][1]);
            }
            else {
                pq.add(trans[i][1]); //더 작은 종료시간을 넣으면 자동정렬된다. 
            }
        }
        
        int answer = pq.size();
        
        return answer;
    }
    public static int time(String t) {
        String[] temp = t.split(":");
        int hour = Integer.parseInt(temp[0]);
        int min = Integer.parseInt(temp[1]);
        return hour*60+min;
    }
    
}