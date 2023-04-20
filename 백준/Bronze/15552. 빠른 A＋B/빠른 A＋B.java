import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException { //예외처리해주기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //버퍼에 쓰기
		int n = Integer.parseInt(br.readLine()); //한꺼번에 받아오고, 형변환 해주기
		for (int i=0; i<n; i++) {  
			String str=br.readLine(); //모두 받아온 문자열을 ' '를 기준으로 토큰화함
			int a = Integer.parseInt(str.split(" ")[0]);
			int b = Integer.parseInt(str.split(" ")[1]);
			bw.write(a+b+"\n"); //버퍼에다가 써주기(한줄씩)
		}
		bw.flush(); //버퍼 비워주기(한꺼번에 반환
	}
}
