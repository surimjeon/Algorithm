import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    static int[][] mapp;
    static int mn=Integer.MAX_VALUE;
    static ArrayList<int[]> home, chick;
    static boolean[] open;
    static int m,n;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        home = new ArrayList<>();
        chick = new ArrayList<>();

        mapp = new int[n][n];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                mapp[i][j]=Integer.parseInt(st.nextToken());
                if(mapp[i][j]==1) {
                    home.add(new int[]{i,j});
                } else if (mapp[i][j]==2) {
                    chick.add(new int[]{i,j});
                }
            }
        }

        open=new boolean[chick.size()];
        //백트래킹
        back(0,0);

        System.out.println(mn);
    }

    public static void back(int start, int now) {
        //전체도시의 치킨 거리
        int ans=0;
        //치킨 거리 계산
        if (now==m) {
            for (int i=0; i<home.size(); i++) {
                //모든 집에서부터 거리
                int dis = Integer.MAX_VALUE;
                for (int j=0; j<chick.size(); j++) {
                    //문열었다면 체크해보기
                    if (open[j]) {
                        int now_dis = Math.abs(home.get(i)[0] - chick.get(j)[0]) + Math.abs(home.get(i)[1] - chick.get(j)[1]);
                        dis = Math.min(now_dis, dis);
                    }
                }
                ans+=dis; //모든 집의 거리를 구함
            }
            mn = Math.min(ans, mn);
            return;
        }
        //만약 아직 치킨집을 더 골라야한다면
        //i=start부터 i<치킨집 몇개있는거까지 (중복을 방지하기 위해)
        for (int i=start; i<chick.size(); i++) {
            open[i]=true;
            back(i+1, now+1);
            open[i]=false;
        }
    }
}


