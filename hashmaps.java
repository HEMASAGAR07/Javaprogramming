package DSA_LAB;
import java.util.*;

public class hashmaps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
	    int n = sc.nextInt();
	    sc.nextLine();
	    
	    for(int i =0;i<n;i++) {
	    	String key = sc.nextLine(); // Read the key
            int value = sc.nextInt();
           
	    	map.put(key , value);
	    }
	    System.out.println(map);
		
		


	}

}
