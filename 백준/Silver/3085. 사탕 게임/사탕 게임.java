import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    public static void main(String[] args) throws Exception{
        // 사탕이 다른 인접한 2칸을 서로 교환
        // 모두 같은 색인 가장 긴 연속부분을 모두 먹음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        char[][] mapp = new char[n][n];

        for (int i=0; i<n; i++) {
            String temp= br.readLine();
            for (int j=0; j<n; j++) {
                mapp[i][j]= temp.charAt(j);
            }
        }
        int mx = 0;

        // 세로로 다 하나씩 바꿔보기 -> 그리고 탐색
        for(int i=0; i<n; i++) {
            int count=0;
            for (int j=0; j<n-1; j++) {
                swap(mapp, i, j, i, j+1); //열 교환
                mx =Math.max(check(mapp), mx);
                //그리고 다시 돌려놓기
                swap(mapp, i, j+1, i,j);
            }

            for (int k=0; k<n-1; k++) {
                swap(mapp, k, i, k+1, i);
                mx = Math.max(check(mapp),mx);
                swap(mapp, k+1, i, k, i);
            }
        }

        System.out.println(mx);
    }
    public static void swap(char[][] arr,int x1,int y1,int x2,int y2){
        char temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp;
    }

    public static int check(char[][] candy) {
        int count=0;
        for (int i=0; i<n; i++) {
            int cnt =1;
            for (int j=0; j<n-1; j++) {
                if (candy[i][j]==candy[i][j+1]) {
                    cnt++;
                    count = Math.max(count,cnt);
                }
                else {
                    cnt=1;
                }
            }
        }

        for (int j=0; j<n; j++) {
            int m_cnt =1;
            for (int i=0; i<n-1; i++) {
                if (candy[i][j]==candy[i+1][j]) {
                    m_cnt++;
                    count = Math.max(count,m_cnt);
                }
                else {
                    m_cnt=1;
                }
            }
        }

        return count;
    }

}
