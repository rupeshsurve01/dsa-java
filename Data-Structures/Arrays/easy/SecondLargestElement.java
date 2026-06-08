import java.sql.Time;
import java.util.Arrays;

public class SecondLargestElement {

    // Brute Force
    // Time Complexity: O(N log N), for sorting the array.
    // Space Complexity: O(1), as we are using a constant amount of space for
    // variables.
    public static int findSecondLargest1(int[] arr) {

        int n = arr.length;
        if (n == 0 || n == 1) {
            System.out.println(-1 + " " + -1); // Print -1 for both second smallest and second largest
            return 0;
        }
        Arrays.sort(arr);

        return arr[n - 2];
    }

    // Better Approach
    // Time Complexity: O(2N), we do two linear traversals in our array.
    // Space Complexity: O(1), as we are using a constant amount of space for
    // variables.
    public static int findSecondLargest2(int[] arr) {

        int n = arr.length;

        if (n == 0 || n == 1) {
            System.out.println(-1 + " " + -1); // Print -1 for both second smallest and second largest
            return 0;
        }
        int largest = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        int s_largest = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > s_largest && arr[i] != largest && arr[i] < largest) {
                s_largest = arr[i];
            }
        }

        return s_largest;
    }

    // optimal
    // Time Complexity: O(N), we do two linear traversals in our array.
    // Space Complexity: O(1), as we are using a constant

    public static int findSecondLargest3(int[] arr) {

        int n = arr.length;

        if (n < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int s_largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > largest) {

                s_largest = largest;
                largest = arr[i];

            } else if (arr[i] > s_largest && arr[i] != largest) {

                s_largest = arr[i];
            }
        }

        return s_largest;
    }

    public static void main(String[] args) {
        // Initialize arrays
        int[] arr1 = { 2, 5,3,5,7,9 };

        // Find and output the largest element in both arrays
        System.out.println("The Largest element in the array is: " + findSecondLargest3(arr1));
    }

}
