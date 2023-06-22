
import java.io.*;
import java.util.*;

public class Main {
	static int price [];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// (현금 + 1월 14일의 주가 × 주식 수)
		int n = Integer.parseInt(br.readLine());
		price = new int[14];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<14; i++) {
			price[i]=Integer.parseInt(st.nextToken());
		}
		
		int p1=player1(n);
		int p2=player2(n);
		
		if (p1>p2) {
			System.out.println("BNP");
		}
		else if (p1<p2) {
			System.out.println("TIMING");
		}
		else {
			System.out.println("SAMESAME");
		}
		
	}
	public static int player1(int base) { //준현 
		int money=base; //자산
		int cnt =0; //보유 주식 수
		
		for (int i=0; i<14; i++) {
			int now =money/price[i];
			cnt+=now;
			money-=(now*price[i]);
		}
		return money+(price[13]*cnt);
	}
	public static int player2(int base) { //선민
		int money=base;
		int cnt =0;
		int up = 0;
		int down =0;
		int yesterday = price[0];
		
		
		for (int i=1; i<14; i++) {
			if (price[i]>yesterday) {
				up++;
				down=0;
			}
			else if(price[i]<yesterday) {
				down++;
				up=0;
			}
			else {
				up =0;
				down=0;
			}
			
			if (up==3) {
				if (cnt!=0) {
					money+=price[i]*cnt;
				}
				cnt=0; //전량 매도
			}
			if (down==3) {
				int now = money/price[i];
				cnt+=now;
				money-=(now*price[i]);
			}
		}
		return money+(price[13]*cnt);
		
	}
	
}
