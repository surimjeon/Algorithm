// 숫자의 해당 숫자에서 높은 수치부터 5이하 -를 뺴는게 좋고, 초과이면, 그거보다 1개 높고 차만큼 뺴는것이 좋은듯 => 이때, 5일 경우에 주의해야되는데, 앞자리 수가 4보다 작으면, 그대로 빼는게 좋고, 6이상이면 더해서 자리수를 올려주는게 더 좋다

class Solution {
    public int solution(int storey) {
        int answer = 0;
        String story = Integer.toString(storey);
        int[] arr = new int[story.length()];
        for (int i=0; i<story.length(); i++) {
            arr[i]=story.charAt(i)-'0';
        }
        
        for (int i=arr.length-1; i>=0; i--) {
            int num=arr[i];
            if (num<5) {
                answer+=num;
            }
            else if (num>5) {
                answer+=(10-num);
                if (i-1<0) {
                    answer++;
                    continue;
                }
                arr[i-1]++;
            }
            else {
                if (i-1<0) {
                    answer+=5;
                    continue;
                }
                else {
                    if(arr[i-1]<5) {
                        answer+=num;
                    }
                    else {
                        answer+=(10-num);
                        arr[i-1]++;
                    }
                }
            }
        }
        
        return answer;
    }
}