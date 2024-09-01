package PLACEMENT_DSA;

import java.util.Scanner;

import PLACEMENT_DSA.BST_char.Node;

public class BST_ORDERS_INT_PRACT {
	
	static class Node{
		int data;
		Node left , right;
		Node(int data){
			this.data= data;
			this.left = null;
			this.right = null;
			
		}
	}
	public static Node insert(Node root , int data) {
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
			System.out.print(temp.data+" ");
			postorder(temp.right);
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node root = null;
		while(n>0) {
			int input = sc.nextInt();
			if (input == -1) {
				
				continue;
			}
			root = insert(root , input);
			n--;
			
		}
		postorder(root);

	}

}
