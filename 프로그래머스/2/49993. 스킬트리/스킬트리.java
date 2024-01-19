// 가능한 스킬트리 개수
import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (int i=0; i<skill_trees.length; i++) {
            boolean flag = true;
            Queue<String> q = new LinkedList<>(); 
            for (int j=0; j<skill_trees[i].length(); j++) {
                q.add(skill_trees[i].substring(j, j+1));
            }
            
            int idx =0;
            while (!q.isEmpty()) {
                String now = q.poll();
                if (skill.contains(now)) { //skill에 now가 포함되어있으면
                    if (skill.indexOf(now)==idx) { // 현재 
                            idx++;
                    }
                    else {
                        flag = false;
                        break;
                    }
                }
            }
            
            if(flag) {
                answer++;
            }
            
            
        }
        return answer;
    }
}