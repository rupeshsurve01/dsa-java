import java.sql.Time;
import java.util.Arrays;

public class LargestElement {

    // BruteForce Solution
    // Time Complexity: O(N log N), where N is the size of the array, as we are
    // sorting the array.
    // Space Complexity: O(1), as we are using a constant
    public static int findLargest(int[] arr) {

        Arrays.sort(arr);

        return arr[arr.length - 1];
    }

    // Optimal Approach
    // Time Complexity: O(N), where N is the size of the array, as we are iterating
    // through the array once.

    // Space Complexity: O(1), as we are using a constant
    public static int findLargest2(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    public static void main(String[] args) {
        // Initialize arrays
        int[] arr1 = { 2, 5, 1, 3, 0 };

        // Find and output the largest element in both arrays
        System.out.println("The Largest element in the array is: " + findLargest2(arr1));
    }
}
