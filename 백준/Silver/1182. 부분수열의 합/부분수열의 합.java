
import java.util.*;
import java.io.*;


public class Main {

	static int n,s, cnt=0;
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st1.nextToken());
		}
		
		
		dfs(0, 0);
		
		if(s==0) { //s가 0인경우 공집합도 포함되기 때문에 1개빼준다(크기가 양수인 부분수열에 위반)
			cnt--;
			System.out.println(cnt);
		}
		else {
		System.out.println(cnt);
		}
	}
	
	public static void dfs(int hap, int i) {
		if (i==n) { //끝까지 다 돌았을 떄(원소를 포함시켜봤을 때)
			if (hap==s) { //합이 s목표값과 같다면 cnt++
				cnt++;
			}
			return;
		}
			dfs(hap, i+1); //원소를 선택하지 않아보기
			dfs(hap+arr[i],i+1); //원소를 선택해보기
			//두 dfs를 빠져나왔다가 들어갔다가 하면서 모든 경우를 헤아려 봄
		}
	}


