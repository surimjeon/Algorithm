import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i]=Integer.parseInt(st.nextToken())*2;
        }

        for (int i=1; i<n; i++) {
            int mn = Math.min(arr[0], arr[i]);
            for (int j=mn; j>0; j--) {
                if (arr[0]%j==0 && arr[i]%j==0) {
                    System.out.print(arr[0]/j);
                    System.out.print("/");
                    System.out.print(arr[i]/j);
                    break;
                }
            }
            System.out.println();
        }
    }
}
