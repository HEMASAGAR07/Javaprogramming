package DSA_LAB;
import java.util.Scanner;

public class array_prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array with the specified size
        int[][] array = new int[rows][columns];

        // Get input for each element of the 2D array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
 
                array[i][j] = scanner.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("The entered 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0;i<rows;i++) {
        	 for(int j=0;j<rows;j++) {
        		 for(int k=0;k<rows;k++) {
        			 for(int l=0;l<rows;l++) {
        				if(array[i][j]>array[k][l]) {
        					int temp = array[i][j];
        					array[i][j] = array[k][l];
        					array[k][l] = temp;
        				}
        				 
        			 }
        		 }
        	 }
        	
        }
        System.out.println("Sorted array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        
       
    }
}
