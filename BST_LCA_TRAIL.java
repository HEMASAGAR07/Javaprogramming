package PLACEMENT_DSA;

import java.util.Scanner;

public class BST_LCA_TRAIL {
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data =data;
			Node right = null;
			Node lrft = null;
		}
	}
	public static Node newnode(int data) {
		return new Node(data);
	}
	
	public static Node insert(Node root , int data) {
		if(root == null) {
			root = new Node(data);
		}else if(data >= root.data) {
			root.right = insert(root.right,data);
		}else {
			root.left = insert(root.left,data);
			
		}
		return root;
	}
	public static Node lca(Node root, int n1,int n2) {
		if(root==null) {
			return null;
		}else if(root.data>n1 && root.data>n2) {
			return lca(root.left,n1,n2);
		}else if(root.data<n1 && root.data<n2){
			return lca(root.right,n1,n2);
			}
		return root;
	}
	public static void postorder(Node root) {
		if(root != null) {
		
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		Node root = null;
		for (int i = 0; i < n; i++) {
            int r = sc.nextInt(); // Read the first character of the line
            root = insert(root, r);
        }
		
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Node result = lca(root , n1,n2);
		System.out.println(result.data);
		postorder(root);
	

	}

}
