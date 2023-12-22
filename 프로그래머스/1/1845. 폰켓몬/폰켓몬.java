//  N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int i : nums)  st.add(i);
        int answer = Math.min(nums.length/2, st.size());
        return answer;
    }
}