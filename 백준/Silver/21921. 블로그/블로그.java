import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
        static StringTokenizer st;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //블로그 시작 n일 지남 x일동안 가장 많이 들어온 방문자 수와 기간
        //n,x가 공백
        //1~n일차까지 하루 방문자 수
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int cnt =1;
        int[] mapp = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            mapp[i]=Integer.parseInt(st.nextToken());
        }

            int sm=0;
            for (int j=0; j<x; j++) {
                //0부터 j까지 합구하기
                sm+=mapp[j];
            }
            int ans = sm;

            for (int i=0; i<n-x; i++) {
                sm-=mapp[i];
                sm+=mapp[i+x];

            if (ans ==sm) {
                cnt++;
            }
            else if (ans<sm){
                cnt=1;
                ans = sm;
            }

        }
        if (ans==0) {
            System.out.println("SAD");
        }
        else {
            System.out.println(ans);
            System.out.println(cnt);

        }


    }


}


