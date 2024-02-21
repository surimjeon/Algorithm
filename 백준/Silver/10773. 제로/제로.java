import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();
        for (int i=0; i<n; i++) {
            int m = Integer.parseInt(br.readLine());
            if (m==0 && !st.isEmpty()) {
                st.pop();
                continue;
            }
            st.add(m);
        }

        int ans = 0;
        while (!st.isEmpty()) {
            ans+=st.pop();
        }

        System.out.println(ans);
    }

}