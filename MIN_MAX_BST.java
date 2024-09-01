package PLACEMENT_DSA;
import java.util.*;


public class MIN_MAX_BST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Character> t = new TreeSet<>();
		int size = sc.nextInt();
		while(size !=0 ) {
			char c = sc.next().charAt(0);
			t.add(c);
			size--;
		}
		if(!t.isEmpty()) {
			System.out.println("Min"+t.first());
			System.out.println("Min"+t.last());
			
		}
		

	}

}
