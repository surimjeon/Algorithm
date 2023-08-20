class Solution {
    public int solution(String[] babbling) {
        //aya, ye, woo, ma 4가지 조합(연속해서 같은 발음어려움)
        int answer = 0;
       
        for (String bab : babbling) {
            bab=bab.replaceAll("ayaaya|yeye|woowoo|mama", " ");
            bab=bab.replaceAll("aya|ye|woo|ma","");
            if (bab.equals("")) {
                answer++;
            }
        }
        
        
        return answer;
    }
}