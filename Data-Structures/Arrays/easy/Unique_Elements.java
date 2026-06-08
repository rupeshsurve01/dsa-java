import java.sql.Time;
import java.util.HashSet;

public class Unique_Elements {

    // Brute Force
    // Time Complexity: O(N), We traverse the entire array and insert elements into
    // set.
    // Space Complexity: O(N), additional space used to store elements in set.
    public static int countUniqueElements(int[] arr) {

        if (arr.length == 0)
            return 0;

        HashSet<Integer> set = new HashSet<>();

        int index = 0;

        for (int num : arr) {

            if (!set.contains(num)) {
                set.add(num);

                arr[index] = num;

                index++;
            }
        }
        return index;
    }

    // Optimal Approach
    // Time Complexity: O(N), We traverse the entire original array only once.
    // Space Complexity: O(1), constant additional space is used to check unique
    // elements.

    public static int countUniqueElements2(int[] arr) {

        // If array is empty, return 0
        if (arr.length == 0)
            return 0;

        // Pointer for last unique element
        int i = 0;

        // Start from second element
        for (int j = 1; j < arr.length; j++) {
            // If new unique element is found
            if (arr[j] != arr[i]) {
                // Move unique position forward
                i++;
                // Place new unique element
                arr[i] = arr[j];
            }
        }

        // i is last index of unique element, count = i + 1
        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        System.out.println("Unique Elements in a Array are : " + countUniqueElements2(arr));
    }
}
