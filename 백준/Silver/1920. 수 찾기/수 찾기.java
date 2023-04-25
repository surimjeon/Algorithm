import java.io.*;
import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

//최대값(M)을 골라서 모든 점수를          현재점수/ M*100으로 고치기

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//시간복잡도 n**2? n.m은 10만->10만제곱하면-> 넘음..->log n*n인 이진탐색 구현
		int n = Integer.parseInt(br.readLine());
		String[] n_arr = br.readLine().split(" ");
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(n_arr[i]);
		}
		Arrays.sort(arr); //배열을 정렬하는 메소드 Arrays.sort(배열이름)
		//12345
	
		
		int m = Integer.parseInt(br.readLine());
		String[] m_arr = br.readLine().split(" ");

		
		for (int i=0; i<m;i++) {
			int start=0;
			int end=n-1;
			int ans =0;
			
			while (start<=end) {
				int middle=(end+start)/2;
				
				if (Integer.parseInt(m_arr[i])<arr[middle]) {
					//중간보다 작으면, end를 움직이기
					end=middle-1; 
					}
				else if (Integer.parseInt(m_arr[i])>arr[middle]) {
					start=middle+1;
				}
				else {
					ans=1;
					break;
				}

			}
			System.out.println(ans);
		}

		}
		
		
	}
