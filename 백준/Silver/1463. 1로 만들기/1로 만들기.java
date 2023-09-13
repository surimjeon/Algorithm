import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //연산을 저장하는 횟수의 최소값(최소시간들울 dp배열에 저장)
    static Integer[] dp;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n+1]; //연산사용하는 횟수 저장

        dp[0]=dp[1]=0; //1까지 도달했는지 여부 체크하기 위해 Integer으로 선언후 0넣기

        int ans = cal(n);

        System.out.println(ans);

    }

    static int cal(int num) {
        //메모이제이션으로 이전값을 저장해놓은 다움,
        // 최소로 메모이제이션에 값을 써놓은것+1
        if (dp[num]==null) {
            if (num%6==0) {
               dp[num]= Math.min(Math.min(cal(num/3), cal(num/2)), cal(num-1))+1;
            }
            else if(num%3==0) {
                dp[num]= Math.min(cal(num/3), cal(num-1))+1;
            }
            else if(num%2==0) {
                dp[num]= Math.min(cal(num/2), cal(num-1))+1;
            }
            else {
                dp[num]=cal(num-1)+1;
            }
            }
        return dp[num];
        }

}

