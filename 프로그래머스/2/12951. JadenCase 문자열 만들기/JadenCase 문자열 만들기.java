class Solution {
    public String solution(String s) {
        String answer = "";
        String[] temp = s.split(" "); //split는 공백 여러개를 자를 수 없다
        
        for (int i=0; i<temp.length; i++){
            if (temp[i].length()==0) answer+=" ";
            else {
                answer+=temp[i].substring(0,1).toUpperCase()+temp[i].substring(1, temp[i].length()).toLowerCase();
            answer+=" ";
            }
        }
        
        if (s.substring(s.length()-1, s.length()).equals(" ")) {
                return answer;
            }
        return answer.substring(0, s.length());
        
        
    }
}