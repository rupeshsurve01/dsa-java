import java.sql.Time;

public class Check_isArray_Sorted {

    // Brute Force
    // Time Complexity: O(N^2), as it checks each adjacent pair once in a single
    // pass through the array.

    // Space Complexity: O(1), as it uses constant extra space regardless of input
    // size
    public static boolean isArraySorted(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If any element is smaller than the previous one, return false
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true; // Return true if no unsorted elements are found
    }

    // Optimal
    // Time Complexity: O(N), as it checks each adjacent pair once in a single pass
    // through the array.

    // Space Complexity: O(1), as it uses constant extra space regardless of input
    // size
    public boolean isArraySorted2(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) // If any element is smaller than the previous one, return false
                return false;
        }
        return true; // Return true if the array is sorted
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = 5;

        boolean ans = isArraySorted(arr, n);

        // Output result
        if (ans)
            System.out.println("True");
        else
            System.out.println("False");
    }
}