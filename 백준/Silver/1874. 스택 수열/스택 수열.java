import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;
    public static void main(String[] args) throws Exception{
        //1~n => 오름차순 12345
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();

        //stack에 push를 하는 경우 = 그 숫자에 도달할 때까지
        // poll을 하는 경우 = 숫자에 도달하면, 그 숫자는 만족했으니 뺸다
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i]=num;
        }

        int idx = 0;
        for (int i=1; i<=n; i++) {
            st.push(i);
            sb.append("+").append("\n");

            //내가 찾던 값과 일치하면 다음 idx 체크
            while (!st.empty() && st.peek()==arr[idx]) {
                st.pop();
                sb.append("-").append("\n");
                idx++;
            }
        }
        if(st.isEmpty()) {
            System.out.println(sb);
        }
        else {
            System.out.println("NO");
        }

    }
}

