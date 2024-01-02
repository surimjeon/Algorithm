// 자신보다 앞에 있으면서 가장 가까운곳에 있는 같은 글자는 몇쨰 전? 
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            int idx = -1;
            for (int j=i-1; j>=0; j--) {
                if (s.charAt(i)==s.charAt(j)) {
                    idx = i-j;
                    break;
                }
            }
            answer[i]=idx;
        }
        return answer;
    }
}