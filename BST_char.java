package PLACEMENT_DSA;

import java.util.Scanner;

public class BST_char {
	
	static class Node{
		char data;
		Node left,right;
		Node(char data){
			this.data=data;
			this.left=null;
			this.right=null;
			
		}
		
	}
	
	public static Node insert(Node root,char data) {
		if(root==null) {
			root = new Node(data);
		}
		else if(data <=root.data) {
			root.left = insert(root.left,data);
		}else {
			root.right = insert(root.right,data);
		}
		return root;
	}
	
	public static void postorder(Node temp) {
		if(temp!=null) {
			postorder(temp.left);
			postorder(temp.right);
			System.out.print(temp.data+" ");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node root = null;
		while(n>0) {
			char input = sc.next().charAt(0);
			root = insert(root,input);
			n--;
		}
		postorder(root);
		
	}

}
