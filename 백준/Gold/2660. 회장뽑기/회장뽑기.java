import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int[][] arr;
    static int[] ans;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 제일 깊은?? = 5점까지
        int n = Integer.parseInt(br.readLine());

        arr = new int[n+1][n+1];

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (i!=j)
                    arr[i][j]=251; //최소값을 구하기 위해 최대값으로 세팅
            }
        }

        while (true) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (x==-1 && y==-1) break;
            arr[x][y]=1;
            arr[y][x]=1;
        }

        // 후보 점수, 후보 수
        // 회장 후보(오름차순)
        ans = new int[n+1];

        for(int k=1; k<n+1; k++) { //중간
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    if (arr[i][j]>arr[i][k]+arr[k][j]) {
                        arr[i][j]=arr[i][k]+arr[k][j];
                    }
                }
            }
        }
        int final_mn = Integer.MAX_VALUE;
        // 각각의 거리를 다 입력한 상태
        for (int i=1; i<n+1; i++) {
            int mn = 0;
            for (int j=1; j<n+1; j++) {
                if (arr[i][j]!=251) {
                    //연결되어있다면 가장 작은 연결의 수
                    mn = Math.max(arr[i][j], mn);
                }
            }
            // 배열에 집어넣기
            ans[i]=mn;
            final_mn = Math.min(final_mn, ans[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print(final_mn+" ");
        int count =0;
        for (int i=1; i<=n; i++) {
            if (final_mn==ans[i]) {
                count++;
                list.add(i);
            }
        }
        System.out.println(count);

        for (int i=0; i<count; i++) {
           System.out.print(list.get(i)+" ");
        }

    }



}