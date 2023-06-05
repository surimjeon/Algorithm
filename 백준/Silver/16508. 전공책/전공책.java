
import java.util.*;
import java.io.*;


public class Main {
	
	static ArrayList<Book> books = new ArrayList<>();
	static int n;
	static int mn=Integer.MAX_VALUE;
	static int[] cnt, selectcnt;
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String want = br.readLine();
		n = Integer.parseInt(br.readLine());
		cnt = new int[26];
		selectcnt = new int[26];
		
		for (int i=0; i<want.length(); i++) {
			cnt[want.charAt(i)-'A']++;
		}
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			books.add(new Book(Integer.parseInt(st.nextToken()), st.nextToken()));
		}
		
		dfs(0,0); //n이 되기 위한 idx,total전공책 가격
		//mn이 바뀐게 없다면, 즉,, 단어를 만들 수 없다면,, -1
		if (mn==Integer.MAX_VALUE) mn=-1;
		
		System.out.println(mn);
	}
	public static void dfs(int idx, int total) {
		//전공책을 돌았다면 돌아가기 
		if (idx==n) {
			if (check()) {//내가 찾는 글자를 다 찾았다면
				mn=Math.min(total, mn);
			}
			return; 
		}
		//아니라면, 현재 책길이만큼 넣어보고 체크해보기
		for (int i=0; i<books.get(idx).title.length(); i++) {
			selectcnt[books.get(idx).title.charAt(i)-'A']++;
		}
		dfs(idx+1, total+books.get(idx).price);
		//다시 빼고 체크하기
		for (int i=0; i<books.get(idx).title.length(); i++) {
			selectcnt[books.get(idx).title.charAt(i)-'A']--;
		}
		dfs(idx+1, total);
}
	
	public static boolean check() {
		for (int i=0;i<26; i++) {
			if(cnt[i]>selectcnt[i]) { //select가 만족못시켰으면 false
				return false;
			}
		}
		return true; //for를 모두 다 돌았다면 true
	}
}


//클래스를 정의해야, type으로 쓸 수 있음(정수도 하나의 클래스이다)
class Book {
	int price;
	String title;

	//생성자 정의
	Book(int price, String title){
		this.price=price;
		this.title=title;
	}
}


