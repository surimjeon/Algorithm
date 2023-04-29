
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] quack = {'q','u','a','c','k'};
		char txt[] = br.readLine().toCharArray(); //문자열을 배열로 만들기
		int cnt =0;
		if (txt.length%5!=0) {
			System.out.println(-1);
			System.exit(0);
		}
		int remain = txt.length;
		
		while (remain!=0) { // while 남아있는게 없을 대까지
			boolean check = false;// setting quack이 한번이라도 있는지 -> true/false, 오리 문자열 돌수 있는 인덱스, 원래 배열 돌 수 있는 인덱스
			int qu = 0;
			int idx=0;
			
			while (idx < txt.length) {		// while 원래 배열인덱스가 끝까지 다갈 때까지 돌기
				if (quack[qu]==txt[idx]) { // if quack[qu]==arr[idx]이면, null로 만들고, qu +1
					txt[idx]='\0';
					qu++;
					}
				idx++; // idx+1
				if (qu==5) { // qu가 5이면, 다시 세팅, qu=0, check=true, 남아있는 개수를 -5
					qu=0;
					check=true;
					remain-=5;
					}
				}//while 하나 나가기
			if (check) cnt++;
			else {cnt=-1; break;}// 만약에 true(오리가 하나라도 울면) cnt+1 , 오리가 하나도 안울면 break
		
		}
		
		System.out.println(cnt);
		
	}
}
	