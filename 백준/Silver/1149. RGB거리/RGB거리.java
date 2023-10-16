import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int red =0;
    static int green =1;
    static int blue =2;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1~n번 집을 칠하는데, 앞뒤 집은 다르면 안된다 -> 모두 다를필요x
        int n = Integer.parseInt(br.readLine());

        int [][] arr = new int[n][3];

        for (int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<3; j++) {
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for (int i=1; i<n; i++) {
            arr[i][red]+=Math.min(arr[i-1][blue], arr[i-1][green]);
            arr[i][blue]+=Math.min(arr[i-1][red], arr[i-1][green]);
            arr[i][green]+=Math.min(arr[i-1][blue], arr[i-1][red]);
        }


        System.out.println(Math.min(Math.min(arr[n-1][red], arr[n-1][green]), arr[n-1][blue]));


    }

}