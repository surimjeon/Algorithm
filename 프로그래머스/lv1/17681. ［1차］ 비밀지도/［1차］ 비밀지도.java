class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        //어느하나라도 벽이면 전체에서도 벽 # 1
        // 공백인 부분은 전체에서도 공백 0
        
        //arr1의 각 정수를 2진수 문자형으로 바꾸는데, n자리를 어떻게 만들까??
        for (int i=0; i<arr1.length; i++) {
            String temp = Integer.toString(arr1[i],2);
            String temp2 = Integer.toString(arr2[i],2);
            int [] lst = new int [n];
            int [] lst2 = new int [n];
            int ln = temp.length();
            for (int j=0; j<ln; j++) {
                lst[n-ln+j]=temp.charAt(j)-'0'; //1+
            }
            for (int k=0; k<temp2.length(); k++) {
                lst2[n-temp2.length()+k]=temp2.charAt(k)-'0';
            }
            String ans ="";
            for (int a=0; a<n; a++) {
                if (lst[a]==1 || lst2[a]==1) {
                    ans+="#";
                }
                else if (lst[a]==0 && lst2[a]==0) {
                    ans+=" ";
                }
            }
            answer[i]=ans;
        }
        
        return answer;
    }
}