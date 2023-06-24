import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        //최대 2명, 무게제한 -> 최대한 적게 사용해서 모든 사람 구출
        //작은 사람+큰 사람끼리 비교해야 최대한 태울 수 있는 사람이 나옴
        Arrays.sort(people);
        int answer = 0;
        
        int left =0;
        int right=people.length-1;
        while (left<=right) {
            if (people[left]+people[right]<=limit) {
                left++;
                right--;
                answer++;
                continue;
            }
            right--;
            answer++;
            
        }
        
        return answer;
    }
}