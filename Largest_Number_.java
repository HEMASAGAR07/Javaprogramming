package DSA_LAB;

import java.util.Arrays;
import java.util.Comparator;

public class Largest_Number_ {
    public static String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }

        String[] numStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = String.valueOf(nums[i]);
        }

        Comparator<String> customComparator = (a, b) -> (b + a).compareTo(a + b);
        Arrays.sort(numStrings, customComparator);

        if (numStrings[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String numString : numStrings) {
            result.append(numString);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] nums = {23 ,34,56,12,12};
        String result = largestNumber(nums);
        System.out.println("Largest Number: " + result);
    }
}

