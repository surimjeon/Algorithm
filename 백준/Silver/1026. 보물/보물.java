import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        //상근이가 먼저 게임 시작
        int[] A= new int[n];
        Integer[] B = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            A[i]=Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            B[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A );
        Arrays.sort(B, Collections.reverseOrder());

        int ans=0;
        for (int i=0; i<n; i++) {
            ans+=(A[i]*B[i]);
        }
        System.out.println(ans);
    }
}

