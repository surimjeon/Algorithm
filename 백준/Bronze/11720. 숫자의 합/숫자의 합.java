import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine(); //숫자 개수입력받기(사용하지 않음) 
		int sum=0;
		for (byte i : br.readLine().getBytes()) { //readline을 byte연산자로 바꿔라
			sum+=i-'0';
			
			
		}
		System.out.println(sum);
		br.close();
		
		}
	}