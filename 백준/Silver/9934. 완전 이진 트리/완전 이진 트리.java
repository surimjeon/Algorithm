
import java.io.*;
import java.util.*;

public class Main {
	static int [] arr;
	static List<ArrayList<Integer>> ans;
	static int k;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		k = Integer.parseInt(br.readLine());
		arr=new int [(int)Math.pow(2, k)-1];
		//double형식으로 반환
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		ans = new ArrayList<>();
		for (int i=0; i<k; i++) {
			ans.add(new ArrayList<>());
		}
		//깊이에 맞게 리스트 생성
		search(0, arr.length-1, 0);
		
		for (int i=0; i<k; i++) {
			for (int j : ans.get(i)) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
	public static void search(int start, int end, int depth) {
		if (depth==k) {
			return;
		}
		int cen = (start+end)/2; //이진트리의 중위순회
		ans.get(depth).add(arr[cen]); 
		//ArrayList로 되어있는 ans에서 해당 층에다가 노드중간값 넣기
		
		//왼쪽값 넣기, 
		//depth는 현재 층에서 처리가 완료된 후 다시 함수가 호출될떄는 search에 depth+1이 전달되어 처리가 이뤄짐
		search(start, cen-1, depth+1);
		search(cen+1, end, depth+1);
		
	}
}




