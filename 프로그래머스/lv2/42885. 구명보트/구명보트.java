import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        //많이 태우려면 가장 무거운 사람 + 가벼운 사람이어야 함
        //투포인터 문제
        Arrays.sort(people);
        
        int start =0;
        int end =people.length-1;
        
        while(start<=end) {
            if (people[end]+people[start]<=limit) {
                start++;
            }
            end--; 
            answer++;
            
        }
        
        
        return answer;
    }
}