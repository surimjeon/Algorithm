import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int b = Integer.parseInt(st1.nextToken());
        int c = Integer.parseInt(st1.nextToken());

        long ans = n;
        for (int i=0; i<n; i++) {
//            if (arr[i]>0) {
//                arr[i]-=b;
//                ans+=1;
//            }
            if (arr[i]-b>0) {
                ans +=Math.ceil((arr[i]-b)/(double)c);
            }

        }

        System.out.println(ans);


    }

}