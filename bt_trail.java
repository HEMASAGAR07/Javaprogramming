package PLACEMENT_DSA;



public class bt_trail {
	static class Node{
		int data;
		Node left , right;
		Node(int data){
			this.data =data;
			this.right = null;
			this.left=null;
			
		}
	}
	public static Node newnode(int data) {
		return new Node(data);
	}
	public static void displayinorder(Node temp) {
		if(temp!=null) {
			displayinorder(temp.left);
			System.out.print(temp.data+" ");
			displayinorder(temp.right);
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Node root = newnode(arr[0]);
		  root.left=newnode(arr[1]);
		  root.right=newnode(arr[2]);
		  root.left.left=newnode(arr[3]);
		  root.left.right=newnode(arr[4]);
		  displayinorder(root);
		  

	}

}
