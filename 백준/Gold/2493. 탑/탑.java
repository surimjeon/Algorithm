import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //n개 높이가 다른 탑을 수평 직선 왼쪽부터 오른쪽으로 세우고 꼭대기에 송신기 서치
        // 수평의 왼쪽으로 발사 => 가장 먼저 만나는 탑에서만 수신
        // 6 9 5 7 4 -> 어느탑에서 수신하는지
        int n = Integer.parseInt(br.readLine());

        Stack<int[]> stack = new Stack();

        st = new StringTokenizer(br.readLine());
        int[][] arr = new int[n][2];
        for (int i=0; i<n; i++) {
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=i+1;
        }

        StringBuilder answer = new StringBuilder();


        stack.push(arr[0]);
        answer.append("0 ");

        for (int i = 1; i < n; i++) {
            while (true) {
                if (stack.isEmpty()) {
                    answer.append("0 ");
                    stack.push(arr[i]);
                    break;
                }

                if (stack.peek()[0]>arr[i][0]) {
                    answer.append(stack.peek()[1]+" ");
                    stack.push(arr[i]);
                    break;
                }
                else {
                    stack.pop();
                }

            }
        }

        System.out.println(answer.toString());


    }

}
