import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
         PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0; i<A.length; i++) {
            pq.add(A[i]);
            pq2.add(B[i]);
        }
        
        for (int i=0; i<A.length; i++) {
            answer+=(pq.poll()*pq2.poll());
        }
        
        return answer;
    }
}