package DSA_LAB;


import java.util.*;

public class stacks {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack1 = new Stack<>();
		
		
		
		while(true) {
			
			int choice = sc.nextInt();
		if(choice==4) {
			System.out.println("Program terminated");
		}
		
		if(choice ==1) {
			int number = sc.nextInt();
			stack1.push(number);
			System.out.println("Element "+ number+ " is pushed into the stack");
		}
		else if(choice==2) {
			if(!stack1.isEmpty()) {
				System.out.println("Element "+ stack1.peek() +" is popped from  the stack");
			stack1.pop();
			
			}else {
				System.out.println("Stcak underflow");
			}
		}else if(choice == 3) {
			System.out.println(stack1);
		}else {
			System.out.println("Program terminated");
			break;
			
		}
		
		}
		for(int i =0;i<stack1.size();i++) {
			System.out.println(stack1.get(i));
		}

	}

}

