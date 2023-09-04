import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws Exception{
    // 좌표 (i, j)의 가장 위에 있는 블록을 제거하여 인벤토리에 넣는다.(2초)
    //인벤토리에서 블록 하나를 꺼내어 좌표 (i, j)의 가장 위에 있는 블록 위에 놓는다.(1초)
        //땅 고르기의 최소시간,
        // 인벤토리에는 b개의 블록이 들어있음. 땅의 높이는 256을 초과할 수 없고 음수x,

        // 최대나 최소값에 맞춰야하자나..
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
        int b =Integer.parseInt(st.nextToken());

        int[][] mapp = new int[n][m];
        int mx = 0;
        int mn = 501;
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                mapp[i][j]=Integer.parseInt(st.nextToken());
                mx = Math.max(mx, mapp[i][j]);
                mn = Math.min(mn, mapp[i][j]);
            }
        }

        int mntime =99999999; //최소시간
        int height = 0;
        // 최대높이에 맞출 때,
        for (int k=mn; k<=mx; k++) {
            //매번 최소시간갱신하기 위한 변수
            int time = 0;
            int block = b; //블록개수는 매번 쌓을 떄마다 바뀌기 때문에 변수 선언
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    if (k<=mapp[i][j]) { //현재값보다 목표값이 작으면 빼야지
                        time+=((mapp[i][j]-k)*2);
                        block+=(mapp[i][j]-k);
                    }
                    else {
                        time+=(k-mapp[i][j]);
                        block-=(k-mapp[i][j]);
                    }
                }
            }
            if (block<0) break; //그 케이스는 불가
            if (mntime>=time) {
                mntime= Math.min(time,mntime);
                height = k;
            }
        }
        System.out.println(mntime+" "+height);



    }
}

