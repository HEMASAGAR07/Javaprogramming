package PLACEMENT_DSA;

import PLACEMENT_DSA.bt_trail.Node;

public class charc_bt {
	static class Node{
		char data;
		Node left,right;
		Node(char data){
			this.data=data;
			this.left=null;
			this.right=null;
			
		}
		
	}
	
	public static Node newnode(char data) {
		return new Node(data);
	}
	public static void postorder(Node temp) {
		if(temp!=null) {
			postorder(temp.left);
			postorder(temp.right);
			System.out.print(temp.data+" ");
			
		}
		
	}

	public static void main(String[] args) {
		char arr[]={'Z','E','W','T','Y'};
		
		Node root = newnode(arr[0]);
		  root.left=newnode(arr[1]);
		  root.right=newnode(arr[2]);
		  root.left.left=newnode(arr[3]);
		  root.left.right=newnode(arr[4]);
		  postorder(root);
	}

}
