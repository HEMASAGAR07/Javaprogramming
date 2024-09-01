package DSA_LAB;
import java.util.*;


public class TSP {
	static final int MAX=10;
	static int[][] arr = new int[MAX][MAX];
	static boolean[] completed = new boolean[MAX];
	static int n,cost=0;
	 static void takeinput() {
		 Scanner sc = new Scanner(System.in);
		 n=sc.nextInt();
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<n;j++) {
				 arr[i][j]=sc.nextInt();
			 }
			 completed[i]=false;
		 }
	 }
	 static void minCost(int city) {
		 completed[city] = true;
		 System.out.println(city+1+"--->");
	 }
	 static int leastdistance(int c)
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
