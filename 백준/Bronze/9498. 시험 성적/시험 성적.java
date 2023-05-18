import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

        int n = Integer.parseInt(br.readLine());
        
        if (n>=90 && n<=100) {
            System.out.println('A');
        }
        else if (n>=80 && n<=89) {
            System.out.println('B');
        }
        else if (n>=70 && n<=79) {
            System.out.println('C');
        }
        else if (n>=60 && n<=69) {
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
	}	
}