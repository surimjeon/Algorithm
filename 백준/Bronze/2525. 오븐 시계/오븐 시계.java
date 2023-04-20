import java.util.*;
public class Main {

	public static void main(String[] args) { //예외처리해주기
		//인공지능 오븐에 넣으면 분단위로 계산해줌
		//시작하는 시간과 오븐구이하는데 필요한 시간 분단위->끝나는 시간은?
		Scanner sc = new Scanner(System.in);
		int h =sc.nextInt();
		int m = sc.nextInt();
		int time = sc.nextInt();
		int out_m = m+time;
		
		if (out_m>=60) {
			m=(out_m)%60;
			h=((out_m)/60)+h;
			if (h>=24) h-=24;
		}
		else m=out_m;
	
		System.out.print(h+" "+m);
	}
}
