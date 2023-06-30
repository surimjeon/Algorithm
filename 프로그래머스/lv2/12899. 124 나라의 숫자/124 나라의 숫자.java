class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder st = new StringBuilder();
        
        while (n>0) {
            int save = n%3;
            if (save==0) {
                st.insert(0,'4');
                n= n/3 - 1;      
            }
            else {
                st.insert(0,save);
                n=n/3;
            }
        
        }
        
        return st.toString();
    }
}