
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int length=1;
		int temp=0;
		
		if (n<10) temp=(n*10)+n;
		else temp=(n%10)*10+(((n/10)+(n%10))%10);
		
		while (n!=temp) {
			if (temp<10) {
				temp=(temp*10)+temp;
				length+=1;
			}
			else {
				temp=(temp%10)*10+(((temp/10)+(temp%10))%10);
				length+=1;
			}
			
		}
		
	System.out.println(length);
	}
	}
