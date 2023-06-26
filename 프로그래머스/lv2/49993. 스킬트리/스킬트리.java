class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String tree: skill_trees) {
            String temp = tree.replaceAll("[^"+skill+"]","");
            for (int j=0; j< skill.length()+1; j++) {
                String s = skill.substring(0,j); 
                if (temp.equals(s)) {
                    answer++;
                    break;
                }
            }
            
        }
        return answer;
    }
}