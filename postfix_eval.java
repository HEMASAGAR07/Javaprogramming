package PLACEMENT_DSA;
import java.util.*;

public class postfix_eval {
	
	public static int postfixevalution(String expression) {
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<expression.length();i++) {
			char ch =expression.charAt(i);
			if(Character.isDigit(ch)) {
				
				s.push(Character.getNumericValue(ch));
			}else {
				if(ch=='*' || ch=='+'||ch=='-'||ch=='/') {
					int a =s.pop();
					int b=s.pop();
					
					if(ch=='*') {
						int val = b*a;
					    s.push(val);
						
					}else if(ch=='/') {
						int val = b/a;
					    s.push(val);
						
					}
					else if(ch=='+') {
						int val = b+a;
					    s.push(val);
						
					}
					else if(ch=='-') {
						int val = b-a;
					    s.push(val);
						
					}
				}
			}
		}
		return s.pop();
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String postfix_exp = sc.nextLine();
		int result = postfixevalution(postfix_exp);
		System.out.println(result);

	}

}
