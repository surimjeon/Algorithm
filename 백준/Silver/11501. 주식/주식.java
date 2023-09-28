import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            long[] lst = new long[n];
            StringTokenizer temp = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                lst[j] = Integer.parseInt(temp.nextToken());
            }

            long mx = lst[n-1];

            //상승 추세이면, 사야돼. 그러다가 가장 최고점이 오면 팔아야 함
            //마지막부터 돌아야한다. 그 이유는 중간에 상승하더라도 마지막에 제일 큰 수가 나오면
            // 그 숫자로 반영해야하기 때문
            long ans = 0;
            for (int j = n - 2; j >= 0; j--) {
                if (mx < lst[j]) {
                    mx = lst[j];
                }
                else {
                    ans+=mx-lst[j];
                }
            }
            System.out.println(ans);
        }
    }
}
