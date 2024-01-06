// 첫문자만 대문자
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        s = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
        
        for (int i=1; i<s.length(); i++) {
            if (s.substring(i-1, i).equals(" ")) {
                s = s.substring(0, i) + s.substring(i,i+1).toUpperCase() + s.substring(i+1); 
            }
        }
        
//         for (int i=0; i<str.length; i++) {
//             String temp = str[i].substring(0,1).toUpperCase()+str[i].substring(1).toLowerCase();
//             answer+=temp;
            
//         }
        
        return s;
    }
}