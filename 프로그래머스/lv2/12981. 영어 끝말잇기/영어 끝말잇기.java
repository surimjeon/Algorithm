import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) { //n은 사람 수, words는 배열
        int[] answer= new int[2];
        // arraylist로 이전단어를 비교해보고, 동일한 단어가 없는지 보는 용도
        ArrayList<String> arr = new ArrayList<>();
        arr.add(words[0]);
        int idx =0;
        
        for (int i=1; i<words.length; i++) {
            if (!arr.contains(words[i])) {
                String pre = arr.get(idx);
                if (words[i].charAt(0)!=pre.charAt(pre.length()-1)) {
                    return fail(i,n);
                }
                idx++;
                arr.add(words[i]);
            }
            else {
                return fail(i,n);
            }
        }
        return answer;
    }
    public static int[] fail(int i, int n) {
        int [] answer = new int[2];
        answer[0]= (i%n)+1;
        answer[1]=(i/n)+1;
        return answer;
    }
}