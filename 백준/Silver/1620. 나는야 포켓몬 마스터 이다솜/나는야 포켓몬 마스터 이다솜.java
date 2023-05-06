

import java.io.*;

import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//n장의 카드 중 3장을 골라서 숫자 m을 넘지 않으면서 m과 최대한 가깝게 만들기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		//포켓몬의 이름을 보면 포켓몬의 번호를 말하거나, 포켓몬의 번호를 보면 포켓몬의 이름을 말하는 연습
		// 포캣몬 개수 n, 문제개수 m
		//첫 글자만 대문자이고, 나머지 문자는 소문자 or 마지막 문자만 대문자일
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> pocket = new HashMap(); //문자로 숫자 찾기
		String[] arr = new String[n+1]; //숫자로 문자 찾기
				
		for (int i=1; i<=n; i++) {
			String temp=br.readLine();
			pocket.put(temp,i);
			arr[i]=temp;
		}
		
		for (int j=0; j<m; j++) {
			String ans = br.readLine();
			boolean isnumeric = ans.matches("[+-]?\\d*(\\.\\d+)?");
			if (isnumeric) {
				String in = arr[Integer.parseInt(ans)];
				sb.append(in).append("\n");
			}
			else {
				sb.append(pocket.get(ans)).append("\n");
					}
				}
		System.out.println(sb);
		}

	}