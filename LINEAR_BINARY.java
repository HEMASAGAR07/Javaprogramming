package DSA_LAB;

public class LINEAR_BINARY {
 
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
 
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 42, 49, 55};

        int linearResult = linearSearch(array, 23);
        System.out.println("Linear Search Result: " + linearResult);

        int binaryResult = binarySearch(array, 23);
        System.out.println("Binary Search Result: " + binaryResult);
    }
}
