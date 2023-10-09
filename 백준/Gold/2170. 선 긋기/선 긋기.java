import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            arr[i][0]=start;
            arr[i][1]=end;
        }

        //오름차순으로 정렬
        Arrays.sort(arr, (o1, o2) -> o1[0]==o2[0] ? o1[1]-o2[1]: o1[0]-o2[0]);

        int start = arr[0][0];
        int end = arr[0][1];
        int ans = end-start;

        for (int i=1; i<n; i++) {
            // 1. 선이 완전히 겹침
            if (start<=arr[i][0] && end>= arr[i][1]) {
                continue; //선이 겹친다면 continue
            }
            // 2. 중간에 겹친다면(end보다 현재 start가 더 작음)
            else if (end > arr[i][0]) {
                ans+=(arr[i][1]-end);
            }
            // 3. 겹치지 않는다면
            else {
                ans+=(arr[i][1]-arr[i][0]);
            }
            end = arr[i][1];
            start=arr[i][0];
        }
        System.out.println(ans);

    }

}