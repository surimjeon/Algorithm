import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = bridge_length; //한개의 트럭은 다리를 지나기위해 다리길이만큼 가야한다 
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        for (int i=0; i<truck_weights.length; i++) {
            q.add(truck_weights[i]);
        }
        
        while (!q.isEmpty()) { 
            int temp;
            if (bridge.isEmpty()) {
                temp = q.poll();
                bridge.add(temp);
                sum+=temp;
            }
            else {
                if (bridge.size()==bridge_length) {
                    temp = bridge.poll();
                    sum-=temp;
                }
                if (sum+q.peek()<=weight) {
                    temp=q.poll();
                    bridge.add(temp);
                    sum+=temp;
                }
                else {
                    if (sum>weight) {
                        sum-=bridge.poll();
                    }
                    else {
                        bridge.add(0);
                    }
                }
            }
            answer++;
        }
        
           
        // Q에 넣는데, Q의 사이즈가 LENGTH보다 작거나 같거나, 합한 값이 weight보다 작아야 들어갈 수 있음
        //or 큐에 요소가 있다면 빼내기
        return answer;
    }
}