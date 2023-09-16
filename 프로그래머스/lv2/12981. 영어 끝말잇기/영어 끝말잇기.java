import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer=new int[2]; //번호, 차례 
        //n명, 마지막문자로 시작하는 단어 말하기, 이전에 등장한 단어x
        ArrayList<String> arr = new ArrayList<>(); 
        String temp =words[0];
        arr.add(temp);
        
        for (int i=1; i<words.length; i++) {
            if (temp.charAt(temp.length()-1)!=words[i].charAt(0)) {
                answer = new int[]{(i%n)+1, (i/n)+1};
                break;
            }
            
            if(arr.contains(words[i])) {
                answer = new int[]{(i%n)+1, (i/n)+1};
                break;
            }
            arr.add(words[i]);
            temp= words[i];
        }
        
        
        return answer;
    }
}