package PLACEMENT_DSA;

import java.util.*;

public class EveryScratch{
	
 static class Node{
	 int data;
	 Node left,right;
	 Node(int data){
		 this.data=data;
		 this.left=null;
		 this.right=null;
	 }
	 
 }
 
 public static Node insert(Node root , int data) {
	 if(root==null) {
		root = new Node(data);
	 }else if(data<=root.data) {
		 root.left = insert(root.left,data);
	 }else {
		 root.right = insert(root.right,data);
		 
	 }
	 return root;
 }
 public static void postorder(Node root) {
	 if(root!=null) {
		 postorder(root.left);
		 System.out.print(root.data+" ");
		 postorder(root.right);
	 }
 }
 
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		Node root=null;
		while(n>0) {
			int element = sc.nextInt();
			root = insert(root,element);
			n--;
		}
		
	postorder(root);
	}
}

/*public class EveryScratch {
	
	
	public static int postfixeval(String exp) {
		Stack<Integer> s = new Stack<>();
		int result=0;
		
		
		for(int i =0;i<exp.length();i++) {
			
			char ch = exp.charAt(i);
			if(Character.isDigit(ch)) {
				s.push(Character.getNumericValue(ch));
			}
			
			else if(isOperator(ch)) {
				int a1 = s.pop();
				int a2= s.pop();
				
				
				switch(ch) {
				case '*':
					result = a2*a1;
					s.push(result);
					break;
				case '/':
					result = a2/a1;
					s.push(result);
					break;
				case '+':
					result = a2+a1;
					s.push(result);
					break;
				case '-':
					result =a2-a1;
					s.push(result);
					break;
				}
				
				
			}
		}
		return s.pop();
	}
	private static boolean isOperator(char ch) {
		
		return(ch=='+' || ch=='-' || ch=='*' || ch=='/');
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String exp = sc.nextLine();
		System.out.println(postfixeval(exp));
		
	}
}

*/

/*public class EveryScratch {
	
	public static String infixtopostfix(String exp) {
		Stack<Character> s = new Stack<>();
		StringBuilder postfix = new StringBuilder();
		for(int i=0;i<exp.length();i++) {
			char ch = exp.charAt(i);
			
			if(Character.isLetterOrDigit(ch)) {
				postfix.append(ch);
			}else if(isOpearator(ch)) {
				while(!s.isEmpty() && precendence(s.peek())>= precendence(ch)) {
					postfix.append(s.pop());
				}
				s.push(ch);
			}
			else if(ch=='(') {
				s.push(ch);
			}else if(ch==')') {
				while(!s.isEmpty() && s.peek()!='(') {
					postfix.append(s.pop());
				}
				s.pop();
				
			}}
			
			while(!s.isEmpty()) {
				postfix.append(s.pop());
			
		}
		return postfix.toString();
	}
	
	public static boolean isOpearator(char ch) {
		return(ch=='+' || ch=='-' || ch=='*' || ch=='/');
	}
	
	public static int precendence(char ch) {
		switch(ch) {
		case '*':
		case '/':
			return 2;
		case '+':
		case '-':
			return 1;
		default:
			return 0;
		}
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        System.out.println(infixtopostfix(expression));
        
        
    }
}
*/