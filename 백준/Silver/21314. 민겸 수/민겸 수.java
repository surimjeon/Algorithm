import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
        static StringTokenizer st;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //민겸수->십진수 변환 (최대값, 최소값) 구하기
        String mingum = br.readLine();
        StringBuilder sb = new StringBuilder();

        int n=0;
        boolean flag = false;
        for (int i=0; i<mingum.length(); i++) {
            //k가 나왔는데, 이전꼐 없을 경우는 계속 5++
            // k가 나왔는데, 이전꼐 있으면 추가해서 붙임
            if (!flag && mingum.charAt(i)=='K') sb.append(5);
            if (mingum.charAt(i)=='M') {
                n++;
                flag= true;
            }
            else if (mingum.charAt(i)=='K' && flag) {
                sb.append(5);
                for (int j=0; j<n; j++) {
                    sb.append(0);
                }
                flag=false;
                n=0;
            }
        }
        if (n!=0) {
            for (int j=0; j<n; j++) {
                sb.append(1);
            }
        }
        System.out.println(sb);

        n=0;
        sb.setLength(0);
        boolean con = false;
        for (int i=0; i<mingum.length(); i++) {
            if (!con && mingum.charAt(i)=='K') sb.append(5);
            if (mingum.charAt(i)=='M') {
                n++;
                con = true;
            }
            else if(con && mingum.charAt(i)=='K') {
                con = false;
                sb.append(1);
                for (int j=0; j<n-1; j++) {
                    sb.append(0);
                }
                sb.append(5);
                n=0;
            }
        }
        if(n>0) {
            sb.append(1);
            for(int i=0; i<n-1; i++) {
                sb.append(0);
            }
        }

        System.out.println(sb);

        }
    }

