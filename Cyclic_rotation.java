package DSA_LAB;
import java.util.*;
public class Cyclic_rotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int index=0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		int temp[] = new int[n];
		for(int i =n-k;i<n;i++) {
			temp[index]=arr[i];
			index++;
		}
		for(int i =0;i<=k;i++) {
			temp[index]=arr[i];
			index++;
		}
		System.out.println(Arrays.toString(temp));

	}

}
