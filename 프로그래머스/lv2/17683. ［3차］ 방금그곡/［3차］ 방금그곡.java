import java.util.*;
class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int maxtime = 0;
        m=change(m);
        
        for (int i=0; i<musicinfos.length; i++) {
            String temp = musicinfos[i];
            String[] temp_lst = temp.split(",");
            int hour_diff = (Integer.parseInt(temp_lst[1].split(":")[0])*60+Integer.parseInt(temp_lst[1].split(":")[1])) - (Integer.parseInt(temp_lst[0].split(":")[0])*60+Integer.parseInt(temp_lst[0].split(":")[1]));
            
            String base = "";
            
            int idx =0;
            String melody = change(temp_lst[3]);
            int len = melody.length();
            while (idx!=hour_diff) {
                char ch = melody.charAt(idx%len);
                base+=ch;
                idx++;
            }
            
            if (base.contains(m))  {
                if(maxtime<hour_diff) {
                    maxtime = hour_diff;
                    answer=temp_lst[2];
                }
            }
        }
    
       
        return answer;
    }
    String change(String oldMelody) {
        oldMelody=oldMelody.replaceAll("C#", "h");
        oldMelody=oldMelody.replaceAll("D#", "i");
        oldMelody=oldMelody.replaceAll("F#", "j");
        oldMelody=oldMelody.replaceAll("G#", "k");
        oldMelody=oldMelody.replaceAll("A#", "l");
        return oldMelody;
    }
}