import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // keymap = new String[] {"ABCE"};
        // targets = new String[] {"ABDE"};
        int[] answer = new int[targets.length];
        for (int i=0; i<targets.length; i++) {
            String temp = targets[i]; //ABCD
            int sm=0;
            boolean flag = false;
            for (int j=0; j<temp.length(); j++) {
                String ch = temp.substring(j,j+1); //A
                
                int mn = 200;
                for (int k=0; k<keymap.length; k++) {
                    String st = keymap[k];
                    int idx=st.indexOf(ch);
                    if (idx!=-1) {
                        mn = Math.min(mn,idx+1);
                    }
                }
                if(mn==200) {
                    mn=-1;
                    flag=true;
                }
                if (flag) sm=-1;
                else sm+=mn;
            }
            answer[i]=sm;
        }
        return answer;
    }
}