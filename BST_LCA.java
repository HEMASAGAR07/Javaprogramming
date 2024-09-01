package PLACEMENT_DSA;

import java.util.Scanner;


public class BST_LCA {
	static class Node{
		int data;
		Node left , right;
		Node(int data){
			this.data= data;
			this.left = null;
			this.right = null;
			
		}
	}
   static Node newnode(int data) {
	   return new Node(data);
   }
   
   public static Node insert(Node root,int data) {
	   if(root == null) {
		   root = new Node(data);
	   }else if(data<= root.data) {
		   root.left= insert(root.left , data);
	   }else {
		   root.right= insert(root.right , data);
	   }
	   return root;
   }
   
   public static Node lca(Node root , int n1 , int n2) {
	   if(root==null) {
		   return null;
	   }
	   if(root.data >n1 && root.data > n2) {
		   return lca(root.left,n1,n2);
	   }
	   if(root.data <n1 && root.data < n2) {
		   return lca(root.right,n1,n2);
	   }
	   return root;
   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node root = null;
		int n = sc.nextInt();
		for(int i =0;i<n;i++) {
			int r = sc.nextInt();
			root =insert(root , r);
		}
		int anc = sc.nextInt();
		int anc2 = sc.nextInt();
		Node Node1 = lca(root ,anc,anc2);
		System.out.println(Node1.data);

	}

}
