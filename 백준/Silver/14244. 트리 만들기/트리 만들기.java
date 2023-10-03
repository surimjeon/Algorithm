import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //노드 개수
        int m = Integer.parseInt(st.nextToken()); // m개 리프

        //m=2이면, 일직선
        //m=3이면, 1에서 몇개가 뽑아져 나오는지 세면 된다.

        if (m==2) {
            for (int i=0; i<n-1; i++) {
                int next = i+1;
                System.out.print(i+" "+next);
                System.out.println();
            }

        }

        else {
            //m-1개의 리프노드가 남기 전까지는 이전꺼로 계속 연결
            int last_leaf = 0;
            for(int i=0; i<n-m; i++) {
                last_leaf = i+1;
                System.out.print(i+" "+last_leaf);
                System.out.println();
            }
            for (int i=last_leaf+1; i<n; i++) {
                System.out.print(last_leaf+" "+i);
                System.out.println();
            }

        }






    }
}
