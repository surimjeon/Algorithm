// 인덱스 반환 -> 길이가 짧고 / 인덱스가 가장 작은 것
// 오름차순으로 정렬된 수열이 주어짐 = 투포인터..(정렬하고, 그 범위내의 합에 대해 비교하면서 합을 구함)
class Solution {
    public int[] solution(int[] sequence, int k) {
        int ansl = 0; //더 작은 인덱스를 비교하기 위한 변수
        int ansr = sequence.length;
        int sum = 0;
        int l =0; 
        
        //포인터 오른쪽을 하나씩 늘리면서, 추가하고
        for (int r =0; r<sequence.length; r++) {
            sum+=sequence[r];
            // 포인터 합이 넘어가면 왼쪽 포인터를 한개씩 줄이기 
            while (sum>k) {
                sum-=sequence[l]; 
                l++;
            }
            if (sum==k) {
                //길이가 더 짧은 수열이 있으면 그걸로
                if((r-l) < (ansr-ansl)) {
                    ansr = r;
                    ansl = l;
                }
                else if ((r-l) == (ansr-ansl)) {
                    if (ansl>l) {
                        ansl = l;
                        ansr = r;
                    }
                }
                // 길이가 같다면, 더 작은 인덱스를 답으로
            }
        }
        int[] answer = new int[] {ansl, ansr};
        
        return answer;
    }
}