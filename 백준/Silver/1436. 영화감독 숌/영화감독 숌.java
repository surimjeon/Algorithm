import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int count =1;
        int num =666;

        while (n!=count) {
            num++;
            if (Integer.toString(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);


    }
}
