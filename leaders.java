package DSA_LAB;
import java.util.Scanner;
public class leaders{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        sc.close();
        int r = arr.length-1;
        System.out.print(" ");
        System.out.print(arr[r] +"is a leader");
         for(int j =0;j<arr.length;j++){
            for(int k = arr.length-1;k>j;k--){
                if(arr[j]>arr[k]){
                    System.out.println(arr[j]+"is a leader");
                }
                else if(arr[j]<=arr[k]){
                    System.out.println(arr[j]+"not a leader");
                    break;
                }
                else{
                    System.out.println(" ");
                }
            }
 }
}
}