package PLACEMENT_DSA;
import java.util.*;

public class infix_to_prefix_convert {
	
	public static String revwithBracket(String expression) {
		StringBuilder exp = new StringBuilder(expression);
		exp.reverse();
		for(int i =0;i<exp.length();i++) {
			char ch = exp.charAt(i);
			if(ch==')') {
				exp.setCharAt(i, '(');
				
			}else if(ch=='(') {
				exp.setCharAt(i, ')');
				
			}
		}
		
		
		return exp.toString();
		
	}
	private static boolean isOperator(char ch) {
		return(ch=='+' || ch=='-' || ch=='*' || ch=='/');
		
	}
	public static int precedence(char ch) {
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
	
	public static String infixtopostfix(String expression) {
		StringBuilder postfix = new StringBuilder();
		Stack<Character> a = new Stack<>();
		
		for(int i =0;i<expression.length();i++) {
			
			
			char ch = expression.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				postfix.append(ch);
			}
			else if(isOperator(ch)) {
				while(!a.isEmpty() && precedence(a.peek())>=precedence(ch)) {
					postfix.append(a.pop());
				}
				a.push(ch);
			}
			else if(ch=='(') {
				a.push(ch);
			}
			else if(ch==')') {
				while(!a.isEmpty() && a.peek()!='(') {
					postfix.append(a.pop());
				}
				a.pop();
			}
			}
			while(!a.isEmpty()) {
				postfix.append(a.pop());
			}
		
		
		
		return postfix.toString();
		
	}
	


	public static String infixtoprefix(String expression) {
		String revinfix = revwithBracket(expression);
		String postfix=infixtopostfix(revinfix);
		
		return new StringBuilder(postfix).reverse().toString();
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String expression = sc.nextLine();
		String prefix = infixtoprefix(expression);
		System.out.println(prefix);
		
		
		
		

	}

	

}
