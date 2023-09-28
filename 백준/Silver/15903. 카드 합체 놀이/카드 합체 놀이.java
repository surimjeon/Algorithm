import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] lst = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            lst[i]=Integer.parseInt(st.nextToken());
        }

        long temp = 0;
        for (int j=0; j<m; j++) {
            Arrays.sort(lst); //1 2 3 4 / 3 3 3 4 / 6 6 3 4
            temp=lst[0]+lst[1];
            lst[1]=temp;
            lst[0]=temp;
        }
        long sum = 0;
        for (int i=0; i<n; i++) {
            sum+=lst[i];
        }
        System.out.println(sum);
    }
}
