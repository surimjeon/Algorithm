import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws Exception{
        // 사탕이 다른 인접한 2칸을 서로 교환
        // 모두 같은 색인 가장 긴 연속부분을 모두 먹음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] mapp = new int[n][m];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                mapp[i][j]= Integer.parseInt(st.nextToken());
            }
        }

        int k = Integer.parseInt(br.readLine());

        for (int i=0; i<k; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken())-1;
            int y1 = Integer.parseInt(st.nextToken())-1;
            int x2 = Integer.parseInt(st.nextToken())-1;
            int y2= Integer.parseInt(st.nextToken())-1;

            int sm = 0;
            for (int a=x1; a<=x2; a++) {
                for (int b=y1; b<=y2; b++) {
                    sm+=mapp[a][b];
                }
            }
            System.out.println(sm);

        }


        }

}
