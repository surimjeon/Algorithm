import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        //상근이가 먼저 게임 시작

        if (n%2==0) {
            System.out.println("CY");
        }
        else {
            System.out.println("SK");
        }


        }
    }

