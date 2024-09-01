package DSA_LAB;

public class likes {
    public static void main(String[] args) {
        String A = "010101";
        String P = "101101";
        System.out.println(count_like_dislike(A, P)); // Expected output: 3
    }

    static int count_like_dislike(String A, String P) {
        int[] c = new int[A.length()];
        int[] d = new int[P.length()];

        // Convert characters to numeric values for string A
        for (int i = 0; i < A.length(); i++) {
            c[i] = Character.getNumericValue(A.charAt(i));
        }

        // Convert characters to numeric values for string P
        for (int i = 0; i < P.length(); i++) {
            d[i] = Character.getNumericValue(P.charAt(i));
        }

        int result = 0;

        // Count matching numeric values
        boolean[] matched = new boolean[P.length()]; // To keep track of already matched elements in P
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < P.length(); j++) {
                if (c[i] == d[j] && !matched[j]) {
                    result++;
                    matched[j] = true; // Mark this element as matched
                    break; // Break to avoid counting the same character in P again
                }
            }
        }

        return result;
    }
}
