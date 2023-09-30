import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //상근이가 먼저 시작
        //n개의 돌, 마지막돌 누가 이김??
        int n = Integer.parseInt(br.readLine());

        int[] lst = new int[1001];

        int idx = 0;
        //초기값 설정(+1, +3, +4의 초기값)
        lst[1]=1;
        lst[2]=2;
        lst[3]=1;
        lst[4]=1;

        // idx의 +1, +3, +4 이전이 어떤 결과이냐에 따라서 결과값 변화
        for (int i=5; i<=n; i++) {
            if (lst[i-1]%2==0 || lst[i-3]%2==0 || lst[i-4]%2==0) {
                lst[i]=1;
            }
            else {
                lst[i]=2;
            }
        }

        if (lst[n]%2==0) System.out.println("CY");
        else System.out.println("SK");



    }

}
