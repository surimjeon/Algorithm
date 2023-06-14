

import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static Node[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//자바는 node클래스로 각 노드형의 배열을 만들고 거기에 왼쪽,오른쪽 값을 넣음 
		// [BC][D][EF][][G][][]
		
		n = Integer.parseInt(br.readLine());
		arr= new Node[n]; //node형의 arr를 n개
		//배열안에 새로운 노드객체를 생성시킴
		 for (int i=0; i<n; i++) {
	            arr[i] = new Node((char)(i + 'A'));
	        }
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char cen = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			if (left!='.')	arr[cen-'A'].left = arr[left-'A'];
			if (right!='.') arr[cen-'A'].right=arr[right-'A']; //해당 노드(cen)의 right에 right번쨰 값 삽입
		}
		
		preorder(arr[0]); //A노드부터 전위 순회
		System.out.println();
		cenorder(arr[0]);
		System.out.println();
		postorder(arr[0]);
		
	}
	public static void preorder(Node node) {
		System.out.print(node.data); //노드 출력
		if(node.left!=null) preorder(node.left);
		if (node.right!=null) preorder(node.right);
	}
	
	public static void cenorder(Node node) {
		if (node.left!=null) cenorder(node.left);
		System.out.print(node.data);
		if (node.right!=null) cenorder(node.right);
	}
	public static void postorder(Node node) {
		if (node.left!=null) postorder(node.left);
		if (node.right!=null) postorder(node.right);
		System.out.print(node.data);
	}
	
	
	public static class Node {
		char data;
		Node left; //자신을 참조하는 타입, 자신의 왼쪽에 저장
		Node right;
		
		public Node(char data) { //생성자로 node
			this.data =data;
		}
		
	}

}



