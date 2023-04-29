
import java.io.*;
import java.util.*;

public class Main {
	//파일을 확장자 별로 정리해서 몇 개씩 있는지 알려줘
	//보기 편하게 확장자들을 사전 순으로 정렬해 줘
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Map<String,Integer> map = new HashMap<>(); // Hash map선언
		
		for (int i=0; i<n; i++) {
			String arr = br.readLine();
			String key = ""; //n만큼 돌면서 .뒤에 나오는 문자를 'key'로
			for (int j=0; j<arr.length(); j++) {
				if (arr.charAt(j)=='.') {
					key = arr.substring(j+1,arr.length());
				}
			}
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}
			else {
				map.put(key, 1);
			}
		}
		
		
		List<String> keySet = new ArrayList<>(map.keySet());
		
		Collections.sort(keySet); //key값을 기준으로 정렬한다.
		
		for (String key : keySet) {
			sb.append(key).append(" ").append(map.get(key));
			System.out.println(sb);
			sb.setLength(0);
		}

	}
}